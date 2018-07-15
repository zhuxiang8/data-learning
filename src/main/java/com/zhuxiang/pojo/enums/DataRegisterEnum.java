package com.zhuxiang.pojo.enums;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/17 16:35
 */
public enum DataRegisterEnum implements IEnum {
    ENABLED(1, "启用"),

    DISABLED(2, "禁用"),

    CANCEL(3, "作废");

    /**
     * key值
     */
    private int val;
    /**
     * 描述
     */
    private String desc;

    DataRegisterEnum(int val, String desc) {
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
    public static DataRegisterEnum getObj(int val) {
        for (DataRegisterEnum d : DataRegisterEnum.values()) {
            if (d.getVal() == val) {
                return d;
            }
        }
        return null;
    }
}
