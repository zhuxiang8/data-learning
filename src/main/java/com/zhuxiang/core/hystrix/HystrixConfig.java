package com.zhuxiang.core.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author:zhuxiang
 * @Date:2018/7/15 21:32
 */
@Component
@Slf4j
public class HystrixConfig {
    @Autowired
    private RestTemplate restTemplate;
    /**
     * 接口类型
     */
    private final String interfaceType = "GQJ";

    /**
     * 机构代码
     */
    private final String devType = "JBWGD";

    /**
     * 定时获取 南凯系统员工数据接口
     */
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000"),
            @HystrixProperty(name = "execution.timeout.enabled", value = "false")},
            fallbackMethod = "findByIdFallback")
    public void nanKaiEmployeeDataCron() throws Exception {
        log.info("定时器-获取南凯系统用户数据");

        //获取数据库南凯用户数据最新时间(ModifyTime)
        String updateTime = "1991-07-01";

        //本地测试
//            String url = "http://" + ipAndPort + "/api/nankai/test/employee" +
        String url = "http://39.155.237.178:8087/wd-mis/rest/employee/getEmployee.html" +
                "?interfaceType={interfaceType}" +
                "&depType={depType}" +
                "&updateTime={updateTime}";
        Map<String, String> param = new HashMap<>();
        param.put("interfaceType", interfaceType);
        param.put("depType", devType);
        param.put("updateTime", updateTime);
        //发送http请求
        ResponseEntity<NankaiEmployeeResp> responseEntity = restTemplate.getForEntity(url,
                NankaiEmployeeResp.class,
                param);
        log.info("获取用户数据={}", responseEntity);
        NankaiEmployeeResp response = responseEntity.getBody();
        if (response == null) {
            log.warn("返回体为空");
        }
        //判断请求是否成功
        if (StringUtils.equals(response.getSuccess(), "true")) {
            //获取数据成功则进行数据插入或者修改
            log.info("用户数据={}", response.getData());
        }
    }

    public void findByIdFallback() {
        log.info("请求失败");
    }
}
