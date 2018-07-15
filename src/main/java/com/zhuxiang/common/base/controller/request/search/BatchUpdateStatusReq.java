package com.zhuxiang.common.base.controller.request.search;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/18 15:14
 */
@Data
public class BatchUpdateStatusReq {
    /**
     * id集合
     */
    @NotEmpty(message = "ID不能为空")
    private List<Long> ids;

    /**
     * 启动和停用状态 1=启用 2=停用
     */
    @NotNull(message = "状态ID不能为空")
    private Integer enabled;
}
