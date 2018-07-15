package com.zhuxiang.pojo.enums.enterprise;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/17 16:35
 */
public enum EnterpriseAuditEnum implements IEnum {
    TO_AUDIT(1, "待审核"),

    AUDIT_FAILED(2, "审核未通过"),

    ENABLED(3, "启用"),

    DISABLED(4, "停用");

    /**
     * key值
     */
    private int val;
    /**
     * 描述
     */
    private String desc;

    EnterpriseAuditEnum(int val, String desc) {
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
    public static EnterpriseAuditEnum getObj(int val) {
        for (EnterpriseAuditEnum d : EnterpriseAuditEnum.values()) {
            if (d.getVal() == val) {
                return d;
            }
        }
        return null;
    }
}
