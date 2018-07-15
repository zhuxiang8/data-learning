package com.zhuxiang.core.exception;

/**
 * @Description 全局异常处理
 * @Author zhuxiang
 * @Date 2018/4/3 9:43
 */
public class BusinessException extends Exception {
    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
    }


}
