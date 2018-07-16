package com.zhuxiang.core.hystrix;

import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Author:zhuxiang
 * @Date:2018/6/26 17:20
 */
@Data
public class NankaiEmployeeResp extends NankaiResponse {
    /**
     * 用户实体
     */
    private List<NanKaiEmployee> data;
}
