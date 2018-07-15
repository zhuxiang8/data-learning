package com.zhuxiang.common.base.controller.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @Description
 * @Author zhuxiang
 * @Date 2018/6/5 19:55
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Response extends AbstractResponse {
    public Response() {
    }

    public Response(boolean success, String msg) {
        super(success, msg);
    }
}
