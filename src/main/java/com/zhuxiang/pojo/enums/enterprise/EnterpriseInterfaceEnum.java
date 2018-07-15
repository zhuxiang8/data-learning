package com.zhuxiang.pojo.enums.enterprise;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/17 16:35
 */
public enum EnterpriseInterfaceEnum implements IEnum {
    TO_AUDIT(1, "待申请"),

    TOBE_AUDITED(2, "待审核"),

    AUDIT_FAILED(3, "申请未通过"),

    ENABLED(4, "启用"),

    DISABLED(5, "停用");
    /**
     * key值
     */
    private int val;
    /**
     * 描述
     */
    private String desc;

    EnterpriseInterfaceEnum(int val, String desc) {
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
    public static EnterpriseInterfaceEnum getObj(int val) {
        for (EnterpriseInterfaceEnum d : EnterpriseInterfaceEnum.values()) {
            if (d.getVal() == val) {
                return d;
            }
        }
        return null;
    }
}
