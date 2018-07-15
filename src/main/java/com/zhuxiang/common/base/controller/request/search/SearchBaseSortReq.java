package com.zhuxiang.common.base.controller.request.search;

import lombok.Data;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/23 16:17
 */
@Data
public class SearchBaseSortReq {
    /**
     * 运输类型ID
     */
    private Long sortTypeId;

    /**
     * 运输方式ID
     */
    private Long sortModeId;
}
