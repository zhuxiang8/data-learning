package com.zhuxiang.controller.web.user.req;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/22 10:54
 */
@Data
public class BaseUserReq {
    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空")
    private String userName;

    /**
     * 角色ID列表
     */
//    @NotNull(message = "角色不能为空")
    private Long roleId;
}
