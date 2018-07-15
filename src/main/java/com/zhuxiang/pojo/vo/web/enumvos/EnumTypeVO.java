package com.zhuxiang.pojo.vo.web.enumvos;

import com.zhuxiang.pojo.enums.DataRegisterEnum;
import com.zhuxiang.pojo.enums.baseinfo.user.UserTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/5/18 16:06
 */
@Data
@AllArgsConstructor
@Slf4j
public class EnumTypeVO {
    /**
     * key值
     */
    private int val;
    /**
     * 描述
     */
    private String desc;

    /**
     * 将枚举类转换成实体类对象
     *
     * @param obj
     * @return
     */
    public static EnumTypeVO getEnumTypeVO(Object obj) {
        if (obj instanceof DataRegisterEnum) {
            DataRegisterEnum dataRegisterEnum = (DataRegisterEnum) obj;
            return new EnumTypeVO(dataRegisterEnum.getVal(), dataRegisterEnum.getDesc());
        }
        if (obj instanceof UserTypeEnum) {
            UserTypeEnum userTypeEnum = (UserTypeEnum) obj;
            return new EnumTypeVO(userTypeEnum.getVal(), userTypeEnum.getDesc());
        }

        log.error("枚举状态错误={}", obj);
        return null;
    }
}
