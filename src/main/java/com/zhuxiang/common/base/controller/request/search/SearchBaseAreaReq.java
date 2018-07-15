package com.zhuxiang.common.base.controller.request.search;

import lombok.Data;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/23 16:17
 */
@Data
public class SearchBaseAreaReq {
    /**
     * 省份ID
     */
    private Long provinceId;

    /**
     * 市ID
     */
    private Long cityId;

    /**
     * 县ID
     */
    private Long townId;
}
