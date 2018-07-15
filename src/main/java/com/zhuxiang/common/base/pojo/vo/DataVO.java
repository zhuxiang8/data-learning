package com.zhuxiang.common.base.pojo.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/23 10:38
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DataVO extends BaseVO {
    /**
     * 创建时间
     */
    protected Date createTime;

    /**
     * 更新时间
     */
    protected Date updateTime;

    /**
     * 删除标记（Y：正常；N：删除；A：审核；）
     */
    protected String delFlag;
}
