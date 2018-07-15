package com.zhuxiang.pojo.enums;


import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

public enum TaskTypeEnum implements IEnum {

    TO_TIME(30, "同步时间"),

    UPDATE_LOCATION(80, "更新位置"),

    UPDATE_INTERVAL(97, "上传间隔");

    /**
     * key值
     */
    private int val;
    /**
     * 描述
     */
    private String desc;

    TaskTypeEnum(int val, String desc) {
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
    public static TaskTypeEnum getObj(int val) {
        for (TaskTypeEnum d : TaskTypeEnum.values()) {
            if (d.getVal() == val) {
                return d;
            }
        }
        return null;
    }
}
