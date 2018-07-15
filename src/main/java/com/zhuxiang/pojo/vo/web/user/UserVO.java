package com.zhuxiang.pojo.vo.web.user;

import com.zhuxiang.pojo.entity.user.User;
import com.zhuxiang.pojo.vo.web.enumvos.EnumTypeVO;
import lombok.Builder;
import lombok.Data;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/18 15:59
 */
@Data
@Builder
public class UserVO {
    /**
     * 主键ID（唯一标识）
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户类型
     */
    private EnumTypeVO userType;

    /**
     * 用户电话
     */
    private String phone;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 是否可用
     */
    private EnumTypeVO enabled;

    /**
     * 企业ID
     */
    private Long enterpriseId;


    /**
     * 数据库实体类转换成VO对象
     *
     * @param user
     * @return
     */
    public static UserVO getVO(User user) {
        if (user == null) {
            return UserVO.builder().build();
        }
        UserVO userVO = UserVO.builder()
                .id(user.getId())
                .userName(user.getUserName())
                .loginName(user.getLoginName())
                .phone(user.getPhone())
                .email(user.getEmail())
                .userType(EnumTypeVO.getEnumTypeVO(user.getUserType()))
                .enabled(EnumTypeVO.getEnumTypeVO(user.getEnabled()))
                .build();
        return userVO;
    }
}
