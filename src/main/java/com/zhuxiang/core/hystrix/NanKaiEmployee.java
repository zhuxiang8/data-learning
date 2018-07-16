package com.zhuxiang.core.hystrix;

import lombok.Data;

import java.util.Date;

/**
 * @Description 南凯系统 用户对象
 * @Author:zhuxiang
 * @Date:2018/6/25 13:33
 */
@Data
public class NanKaiEmployee {
    /**
     * 主键
     */
    private Long id;

    /**
     * 登录名称
     */
    private String codeNumb;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 登录密码 MD5加密
     */
    private String loginPassword;

    /**
     * 男：1 女0
     */
    private Integer sex;

    /**
     * 是否删除 0 不删除 1 删除
     */
    private String isDelete;
    
    /**
     * 最后修改时间
     */
    private Date modifyTime;

    /**
     * 数据入库时间
     */
    private Date recordTime;
}
