package com.zhuxiang.common.base.controller.request.valid;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Description 校验数据唯一性通用类
 * @Author zhuxiang
 * @Date 2018/6/7 10:36
 */
@Data
public class ValidUniqueReq {
    /**
     * 主键
     */
    private Long id;

    /**
     * 必须传递的参数，需要进行后台相关校验
     */
    @NotBlank(message = "需要校验值不能为空")
    private String value;
}
