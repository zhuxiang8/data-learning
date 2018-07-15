package com.zhuxiang.pojo.enums;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

public enum AdvertisementStatusEnum implements IEnum {

    STATE_OPEN(1, "已发布"),

    STATE_CLOSE(2, "未发布"),

    STATE_DEL(3, "已删除");

    /**
     * key值
     */
    private int val;
    /**
     * 描述
     */
    private String desc;

    AdvertisementStatusEnum(int val, String desc) {
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
    public static AdvertisementStatusEnum getObj(int val) {
        for (AdvertisementStatusEnum d : AdvertisementStatusEnum.values()) {
            if (d.getVal() == val) {
                return d;
            }
        }
        return null;
    }

}
