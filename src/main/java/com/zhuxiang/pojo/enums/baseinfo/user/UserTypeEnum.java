package com.zhuxiang.pojo.enums.baseinfo.user;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/17 16:35
 */
public enum UserTypeEnum implements IEnum {
    SYSTEM_USER(1, "系统用户"),

    ENTERPRISE_USER(2, "企业用户");

    /**
     * key值
     */
    private int val;
    /**
     * 描述
     */
    private String desc;

    UserTypeEnum(int val, String desc) {
        this.val = val;
        this.desc = desc;
    }

    /**
     * 枚举需要重写key值方法
     *
     * @return
     */
    @Override
    public Serializable getValue() {
        return this.val;
    }

    public int getVal() {
        return this.val;
    }

    public String getDesc() {
        return this.desc;
    }

    /**
     * 通过val值 获取枚举对象
     *
     * @param val
     * @return
     */
    public static UserTypeEnum getObj(int val) {
        for (UserTypeEnum d : UserTypeEnum.values()) {
            if (d.getVal() == val) {
                return d;
            }
        }
        return null;
    }
}
