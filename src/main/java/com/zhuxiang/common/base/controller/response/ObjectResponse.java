package com.zhuxiang.common.base.controller.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/23 9:48
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ObjectResponse<T> extends AbstractResponse implements Serializable {
    /**
     * 返回数据 单个对象
     */
    private T data;

    public ObjectResponse() {
    }

    public ObjectResponse(boolean success, String msg) {
        super(success, msg);
    }

    public ObjectResponse(boolean success, String msg, T data) {
        super(success, msg);
        this.data = data;
    }

    /**
     * 静态构造函数
     *
     * @return
     */
    public static ObjectResponse getInstance() {
        return new ObjectResponse();
    }

    /**
     * 操作成功返回
     *
     * @return
     */
    public ObjectResponse success() {
        return new ObjectResponse(true, "操作成功");
    }

    /**
     * 自定义消息返回 操作成功
     *
     * @param msg
     * @return
     */
    public ObjectResponse success(String msg) {
        return new ObjectResponse(true, msg);
    }

    /**
     * 操作成功 返回值
     *
     * @param data
     * @return
     */
    public ObjectResponse success(T data) {
        return new ObjectResponse(true, "操作成功", data);
    }

    /**
     * 操作失败返回
     *
     * @return
     */
    public ObjectResponse fail() {
        return new ObjectResponse(false, "操作失败");
    }

    /**
     * 自定义消息返回 操作失败
     *
     * @param msg
     * @return
     */
    public ObjectResponse fail(String msg) {
        return new ObjectResponse(false, msg);
    }

    /**
     * 操作失败 返回值
     *
     * @param data
     * @return
     */
    public ObjectResponse fail(T data) {
        return new ObjectResponse(false, "操作失败", data);
    }
}
