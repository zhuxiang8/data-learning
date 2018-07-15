package com.zhuxiang.common.base.controller.request;

import lombok.Data;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/8 13:59
 */
@Data
public abstract class  AbstractRequest {
    /**
     * 当前页数
     */
    protected int current;
    /**
     * 每页显示数量
     */
    protected int size;

    /**
     * 构造函数默认设置当前页数和每页显示数量
     */
    public AbstractRequest() {
        this.current = 1;
        this.size = 10;
    }
}
