package com.zhuxiang.pojo.entity.user;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baomidou.mybatisplus.annotations.TableName;
import com.zhuxiang.common.base.pojo.entity.BaseEntity;
import com.zhuxiang.pojo.enums.DataRegisterEnum;
import com.zhuxiang.pojo.enums.user.UserTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author zhuxiang
 * @date 2018/4/2.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@TableName(value = "i_user")
public class User extends BaseEntity<User> {
    /**
     * 用户名
     */
    private String userName;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户类型
     */
    @JSONField(serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
    private UserTypeEnum userType;

    /**
     * 用户电话
     */
    private String phone;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 是否可用
     */
    @JSONField(serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
    private DataRegisterEnum enabled;


}
