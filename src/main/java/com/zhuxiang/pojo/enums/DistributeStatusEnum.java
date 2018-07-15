package com.zhuxiang.pojo.enums;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

public enum DistributeStatusEnum implements IEnum {

    UN_DISTRIBUTE(1, "未派发"),

    EN_DISTRIBUTE(2, "已派发");

    /**
     * key值
     */
    private int val;
    /**
     * 描述
     */
    private String desc;

    DistributeStatusEnum(int val, String desc) {
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
    public static DistributeStatusEnum getObj(int val) {
        for (DistributeStatusEnum d : DistributeStatusEnum.values()) {
            if (d.getVal() == val) {
                return d;
            }
        }
        return null;
    }
}
