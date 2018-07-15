package com.zhuxiang.controller.web.user.req;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/20 15:28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CreateUserReq extends BaseUserReq {
    /**
     * 登录名
     */
    @NotBlank(message = "登录名不能为空")
    private String loginName;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    private String password;
}
