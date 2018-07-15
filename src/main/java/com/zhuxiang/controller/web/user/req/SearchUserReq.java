package com.zhuxiang.controller.web.user.req;

import com.zhuxiang.common.base.controller.request.AbstractRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/23 16:39
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SearchUserReq extends AbstractRequest {
    /**
     * 用户名
     */
    private String userName;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 角色ID
     */
    private Long roleId;
}
