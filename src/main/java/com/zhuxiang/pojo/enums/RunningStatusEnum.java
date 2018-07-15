package com.zhuxiang.pojo.enums;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/17 16:35
 */
public enum RunningStatusEnum implements IEnum {
    NORMAL(1, "正常"),

    ABNORMAL(2, "异常");

    /**
     * key值
     */
    private int val;
    /**
     * 描述
     */
    private String desc;

    RunningStatusEnum(int val, String desc) {
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
    public static RunningStatusEnum getObj(int val) {
        for (RunningStatusEnum d : RunningStatusEnum.values()) {
            if (d.getVal() == val) {
                return d;
            }
        }
        return null;
    }
}
