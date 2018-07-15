package com.zhuxiang.pojo.enums;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

public enum BundleStatusEnum implements IEnum {

    UN_BUNDLE(1, "未绑定"),

    EN_BUNDLE(2, "已绑定");

    /**
     * key值
     */
    private int val;
    /**
     * 描述
     */
    private String desc;

    BundleStatusEnum(int val, String desc) {
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
    public static BundleStatusEnum getObj(int val) {
        for (BundleStatusEnum d : BundleStatusEnum.values()) {
            if (d.getVal() == val) {
                return d;
            }
        }
        return null;
    }
}
