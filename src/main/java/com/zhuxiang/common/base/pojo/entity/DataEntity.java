package com.zhuxiang.common.base.pojo.entity;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.zhuxiang.common.constant.GlobalConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * @Description 数据实体操作基类
 * @Author zhuxiang
 * @Date 2018/4/20 13:41
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public abstract class DataEntity<T extends Model> extends BaseEntity<T> {

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    protected Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    protected Date updateTime;

    /**
     * 删除标记（Y：正常；N：删除；A：审核；）
     */
    @TableField(value = "del_flag")
    @TableLogic
    protected String delFlag;

    public DataEntity() {
        super();
        this.updateTime = DateUtil.date();
        this.delFlag = GlobalConstant.DEL_FLAG_NORMAL;
    }

    public DataEntity(Long id) {
        super(id);
    }

}
