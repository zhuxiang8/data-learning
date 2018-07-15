package com.zhuxiang.common.constant;

/**
 * @Description 全局常量
 * @Author zhuxiang
 * @Date 2018/4/2 15:06
 */
public class GlobalConstant {
    /**
     * 默认密码，重置密码时使用
     */
    public static final String DEFAULT_PASSWORD = "12345678";

    /**
     * TODO
     * 默认企业管理员 ID 3
     */
    public static final Long ENTERPRISE_ROLE_ID = 3L;

    /**
     * 获取本地项目路径，相对路径
     */
    public static final String LOCAL_USER_PATH = System.getProperty("user.dir");


    /**
     * 删除标记（Y：正常；N：删除；A：审核；）
     */
    public static final String DEL_FLAG_NORMAL = "Y";
    public static final String DEL_FLAG_DELETE = "N";
    public static final String DEL_FLAG_AUDIT = "A";

    /**
     * 启用 = 1
     * 停用 = 2
     */
    public static final Integer ACCOUNT_ENABLED = 1;

    public static final Integer ACCOUNT_DISABLED = 2;

    /**
     * 邮件发送时主题类型
     */
    public final static  int MAIL_SUBJECT_TYPE_REGISTER = 1;

    public final static int MAIL_SUBJECT_TYPE_PWD_RESET = 2;

    /**
     * 邮件状态 1(需要发送邮件) 2(不需要发送邮件)
     */
    public static final Integer MAIL_STATUS_NEDD = 1;

    public static final Integer MAIL_STATUS_NEDDLESS = 2;

    public static final double xOffset = 0.001889737;
    public static final double yOffset = 0.004844069;
}
