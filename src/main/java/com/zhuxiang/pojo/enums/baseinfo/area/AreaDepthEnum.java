package com.zhuxiang.pojo.enums.baseinfo.area;

/**
 * @Description 全国行政区划 等级枚举类
 * @Author:zhuxiang
 * @Date:2018/6/19 20:00
 */
public enum AreaDepthEnum {
    /**
     * 根节点
     */
    DEPTH_0("0"),
    /**
     * 省份或者直辖市
     */
    DEPTH_1("1"),
    /**
     * 地级市或者为直辖市的区级
     */
    DEPTH_2("2"),
    /**
     * 县级市
     */
    DEPTH_3("3");

    private String depth;

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    AreaDepthEnum(String depth) {
        this.depth = depth;
    }
}
