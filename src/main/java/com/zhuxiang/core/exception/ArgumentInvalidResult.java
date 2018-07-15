package com.zhuxiang.core.exception;

import lombok.Data;

/**
 * @Description 数据校验异常封装对象
 * @Author zhuxiang
 * @Date 2018/5/10 14:32
 */
@Data
public class ArgumentInvalidResult {
    private String field;
    private Object rejectedValue;
    private String defaultMessage;
}
