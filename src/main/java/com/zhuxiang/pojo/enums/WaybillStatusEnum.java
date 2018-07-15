package com.zhuxiang.pojo.enums;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/17 16:35
 */
public enum WaybillStatusEnum implements IEnum {
    BOOKED(1, "已预订"),

//    PAID(2, "已支付"),

    APPROVE(3, "审核通过"),

    UNAPPROVE(4, "审核未通过"),

    START_RUNNING(5, "启运"),

    END_RUNNING(6, "运达");

    /**
     * key值
     */
    private int val;
    /**
     * 描述
     */
    private String desc;

    WaybillStatusEnum(int val, String desc) {
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
    public static WaybillStatusEnum getObj(int val) {
        for (WaybillStatusEnum d : WaybillStatusEnum.values()) {
            if (d.getVal() == val) {
                return d;
            }
        }
        return null;
    }
}
