package com.zhuxiang.common.base.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/23 15:18
 */
@Data
@ApiModel(description= "返回响应数据")
public abstract class AbstractResponse {

    /**
     * 返回值 {true:成功 false:失败}
     */
    @ApiModelProperty(value = "是否成功")
    protected boolean success;
    /**
     * 错误信息
     */
    @ApiModelProperty(value = "错误信息")
    protected String msg;

    public AbstractResponse() {
    }

    public AbstractResponse(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }


}
