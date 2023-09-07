package com.example.hospital.patient.wx.api.common;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @className BaseEntity
 * @description 基础类
 * @author: LM理智梦
 * @date: 2023/9/6
 * @version: 1.0
 */
@Data
@Accessors(chain = true)
public class BaseEntity {

    @ApiModelProperty(value = "ID")
    @TableId(value = "ID", type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * 乐观锁
     */
    @ApiModelProperty(value = "乐观锁")
    @TableField(value = "REVISION", fill = FieldFill.INSERT)
    @Version
    private Integer revision;
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    @TableField(value = "CREATED_BY", fill = FieldFill.INSERT)
    private String createdBy;
    /**
     * 创建人ID
     */
    @ApiModelProperty(value = "创建人ID")
    @TableField(value = "CREATED_BY_ID", fill = FieldFill.INSERT)
    private Long createdById;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @TableField(value = "CREATED_TIME", fill = FieldFill.INSERT)
    private LocalDateTime createdTime;
    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人")
    @TableField(value = "UPDATED_BY", fill = FieldFill.INSERT_UPDATE)
    private String updatedBy;
    /**
     * 更新人ID
     */
    @ApiModelProperty(value = "更新人ID")
    @TableField(value = "UPDATED_BY_ID", fill = FieldFill.INSERT_UPDATE)
    private Long updatedById;
    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    @TableField(value = "UPDATED_TIME", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedTime;
    /**
     * 逻辑删除
     */
    @ApiModelProperty(value = "逻辑删除 0:未删除1:已删除")
    @TableField(value = "DEL_FLAG", fill = FieldFill.INSERT_UPDATE)
    @TableLogic
    private Integer delFlag;

}