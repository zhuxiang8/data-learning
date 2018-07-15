package com.zhuxiang.common.base.controller.response;

import lombok.Data;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/23 15:18
 */
@Data
public abstract class AbstractResponse {

    /**
     * 返回值 {true:成功 false:失败}
     */
    protected boolean success;
    /**
     * 错误信息
     */
    protected String msg;

    public AbstractResponse() {
    }

    public AbstractResponse(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }


}
