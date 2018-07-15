package com.zhuxiang.common.base.pojo.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/27 14:55
 */
@Data
@ToString(callSuper = true)
public class PageVO<T> {
    /**
     * 分页数据
     */
    private List<T> records;

    /**
     * 总条数
     */
    private Long total;

    public PageVO(List<T> records, Long total) {
        this.records = records;
        this.total = total;
    }
}
