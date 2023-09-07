package com.example.hospital.patient.wx.api.db.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.hospital.patient.wx.api.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @className MedicalDept
 * @description 科室表
 * @author: LM理智梦
 * @date: 2023/9/6
 * @version: 1.0
 */
@Data
@TableName("medical_dept")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "MedicalDept对象", description = "科室表")
public class MedicalDept extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;

    private Boolean outpatient;

    private String description;

    private String location;

    private Boolean recommended;
}