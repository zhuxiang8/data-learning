package com.zhuxiang.common.base.controller.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/23 9:48
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DataResponse<T> extends AbstractResponse implements Serializable {
    /**
     * 返回数据
     */
    private List<T> data;

    public DataResponse() {
    }

    public DataResponse(boolean success, String msg) {
        super(success, msg);
    }

    public DataResponse(boolean success, String msg, List<T> data) {
        super(success, msg);
        this.data = data;
    }

    /**
     * 静态构造函数
     *
     * @return
     */
    public static DataResponse getInstance() {
        return new DataResponse();
    }

    /**
     * 操作成功返回
     *
     * @return
     */
    public DataResponse success() {
        return new DataResponse(true, "操作成功");
    }

    /**
     * 自定义消息返回 操作成功
     *
     * @param msg
     * @return
     */
    public DataResponse success(String msg) {
        return new DataResponse(true, msg);
    }

    /**
     * 操作成功 返回值
     *
     * @param data
     * @return
     */
    public DataResponse success(List<T> data) {
        return new DataResponse(true, "操作成功", data);
    }

    /**
     * 操作失败返回
     *
     * @return
     */
    public DataResponse fail() {
        return new DataResponse(false, "操作失败");
    }

    /**
     * 自定义消息返回 操作失败
     *
     * @param msg
     * @return
     */
    public DataResponse fail(String msg) {
        return new DataResponse(false, msg);
    }

    /**
     * 操作失败 返回值
     *
     * @param data
     * @return
     */
    public DataResponse fail(List<T> data) {
        return new DataResponse(false, "操作失败", data);
    }

    /**
     * 自定义消息返回 操作失败
     *
     * @param msg
     * @param data
     * @return
     */
    public DataResponse fail(String msg, List<T> data) {
        return new DataResponse(false, msg, data);
    }
}
