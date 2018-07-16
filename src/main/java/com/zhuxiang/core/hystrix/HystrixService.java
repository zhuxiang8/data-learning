package com.zhuxiang.core.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author:zhuxiang
 * @Date:2018/7/15 21:55
 */
@Service
public class HystrixService {
    @Autowired
    private HystrixConfig hystrixConfig;

    public void testHystrix() throws Exception {
        hystrixConfig.nanKaiEmployeeDataCron();
    }
}
