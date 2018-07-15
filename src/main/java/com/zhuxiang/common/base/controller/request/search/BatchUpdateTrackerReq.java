package com.zhuxiang.common.base.controller.request.search;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Created by zhuangyulong on 2018/5/23.
 */
@Data
public class BatchUpdateTrackerReq {

    /**
     * imei的集合
     */
    @NotEmpty(message = "imei不能为空")
    private List<String> imeis;

    /**
     * 传递的值
     */
    private Integer value;
}
