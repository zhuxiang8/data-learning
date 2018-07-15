package com.zhuxiang.common.base.controller.response;

import com.zhuxiang.common.base.pojo.vo.PageVO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/23 10:25
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PageResponse<T> extends AbstractResponse implements Serializable {
    /**
     * 分页查询数据
     */
    private PageVO<T> data;

    public PageResponse() {
    }

    public PageResponse(boolean success, String msg) {
        super(success, msg);
    }

    public PageResponse(boolean success, String msg, PageVO<T> data) {
        super(success, msg);
        this.data = data;
    }

    /**
     * 静态构造函数
     *
     * @return
     */
    public static PageResponse getInstance() {
        return new PageResponse();
    }

    /**
     * 操作成功返回
     *
     * @return
     */
    public PageResponse success() {
        return new PageResponse(true, "操作成功");
    }

    /**
     * 自定义消息返回 操作成功
     *
     * @param msg
     * @return
     */
    public PageResponse success(String msg) {
        return new PageResponse(true, msg);
    }

    /**
     * 操作成功 返回值
     *
     * @param data
     * @return
     */
    public PageResponse success(PageVO<T> data) {
        return new PageResponse(true, "操作成功", data);
    }

    /**
     * 操作失败返回
     *
     * @return
     */
    public PageResponse fail() {
        return new PageResponse(false, "操作失败");
    }

    /**
     * 自定义消息返回 操作失败
     *
     * @param msg
     * @return
     */
    public PageResponse fail(String msg) {
        return new PageResponse(false, msg);
    }

    /**
     * 操作失败 返回值
     *
     * @param data
     * @return
     */
    public PageResponse fail(PageVO<T> data) {
        return new PageResponse(false, "操作失败", data);
    }
}
