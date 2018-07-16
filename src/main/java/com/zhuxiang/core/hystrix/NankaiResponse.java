package com.zhuxiang.core.hystrix;

import lombok.Data;

/**
 * @Description
 * @Author:zhuxiang
 * @Date:2018/6/26 16:18
 */
@Data
public class NankaiResponse {
    /**
     * 成功为true，失败为false
     */
    protected String success;

    /**
     * 成功为空，失败返回错误信息
     */
    protected String msg;
}
