package com.zhuxiang.pojo.enums.transport;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/17 16:35
 */
public enum TransportStatusEnum implements IEnum {
    TO_SUBMIT(1, "待提交"),

    TO_AUDIT(2, "待审核"),

    AUDIT_FAILED(3, "审核未通过"),

    APPROVE_PUBLISH(4, "审核通过并发布"),

    FINISHED_DATA(5, "已结束");

    /**
     * key值
     */
    private int val;
    /**
     * 描述
     */
    private String desc;

    TransportStatusEnum(int val, String desc) {
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
    public static TransportStatusEnum getObj(int val) {
        for (TransportStatusEnum d : TransportStatusEnum.values()) {
            if (d.getVal() == val) {
                return d;
            }
        }
        return null;
    }
}
