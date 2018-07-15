package com.zhuxiang.pojo.enums.baseinfo.user;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/17 16:35
 */
public enum RoleTypeEnum implements IEnum {
    SYSTEM_ROLE(1, "系统角色"),

    ENTERPRISE_ROLE(2, "企业角色");

    /**
     * key值
     */
    private int val;
    /**
     * 描述
     */
    private String desc;

    RoleTypeEnum(int val, String desc) {
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
    public static RoleTypeEnum getObj(int val) {
        for (RoleTypeEnum d : RoleTypeEnum.values()) {
            if (val == d.getVal()) {
                return d;
            }
        }
        return null;
    }
}
