package com.zhuxiang.common.base.pojo.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/23 10:36
 */
@Data
@ToString(callSuper = true)
public class BaseVO implements Serializable {
    /**
     * 主键
     */
    protected Long id;

    public BaseVO() {
    }

    public BaseVO(Long id) {
        this.id = id;
    }
}
