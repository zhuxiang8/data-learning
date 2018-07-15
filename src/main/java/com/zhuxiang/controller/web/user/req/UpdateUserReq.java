package com.zhuxiang.controller.web.user.req;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/18 14:57
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class UpdateUserReq extends BaseUserReq {
    /**
     * 主键
     */
    @NotNull(message = "用户主键不能为空")
    private Long id;
}
