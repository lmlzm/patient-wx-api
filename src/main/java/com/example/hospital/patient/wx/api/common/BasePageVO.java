package com.example.hospital.patient.wx.api.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @className BasePageVO
 * @description 基础分页类
 * @author: LM理智梦
 * @date: 2023/9/6
 * @version: 1.0
 */
@Data
@ApiModel(value = "分页", description = "分页")
public class BasePageVO {

    @ApiModelProperty(value = "页码", required = true)
    @NotNull(message = "页码不能为空")
    private Integer pageNum;

    @ApiModelProperty(value = "每页显示多少条", required = true)
    @NotNull(message = "每页显示多少条不能为空")
    private Integer pageSize;
}
