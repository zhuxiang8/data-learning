package com.zhuxiang.pojo.enums;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

/**
 * @Description 节点级别枚举类
 * @Author zhuxiang
 * @Date 2018/5/17 16:35
 */
public enum SortRankEnum implements IEnum {
    ROOT_RANK(0, "根节点"),

    FIRST_RANK(1, "第一节点"),

    SECOND_RANK(2, "第二节点"),

    THIRD_RANK(3, "第三节点"),

    FOUR_RANK(4, "第四节点");

    /**
     * key值
     */
    private int val;
    /**
     * 描述
     */
    private String desc;

    SortRankEnum(int val, String desc) {
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
    public static SortRankEnum getObj(int val) {
        for (SortRankEnum d : SortRankEnum.values()) {
            if (val == d.getVal()) {
                return d;
            }
        }
        return null;
    }
}
