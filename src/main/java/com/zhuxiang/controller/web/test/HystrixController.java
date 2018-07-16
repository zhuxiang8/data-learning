package com.zhuxiang.controller.web.test;

import com.zhuxiang.common.base.controller.response.AbstractResponse;
import com.zhuxiang.common.base.controller.response.ObjectResponse;
import com.zhuxiang.core.hystrix.HystrixConfig;
import com.zhuxiang.core.hystrix.HystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author:zhuxiang
 * @Date:2018/7/15 21:42
 */
@RestController
@RequestMapping("/api/hystrix")
@Slf4j
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @GetMapping
    public AbstractResponse test() throws Exception {
        log.info("测试hystrix断路器");
        hystrixService.testHystrix();
        return ObjectResponse.getInstance().success("测试hystrix断路器");
    }
}
