package com.zhuxiang.common.base.pojo.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @Description 数据实体 基类
 * @Author zhuxiang
 * @Date 2018/4/20 13:34
 */
@Data
@EqualsAndHashCode(callSuper = false)
public abstract class BaseEntity<T extends Model> extends Model<T> {
    /**
     * 主键ID（唯一标识）
     */
    protected Long id;

    public BaseEntity() {
    }

    public BaseEntity(Long id) {
        this.id = id;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
