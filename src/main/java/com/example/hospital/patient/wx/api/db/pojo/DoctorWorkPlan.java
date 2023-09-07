package com.example.hospital.patient.wx.api.db.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.hospital.patient.wx.api.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @className DoctorWorkPlan
 * @description 医生出诊表
 * @author: LM理智梦
 * @date: 2023/9/6
 * @version: 1.0
 */
@Data
@TableName("doctor_work_plan")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DoctorWorkPlan对象", description = "医生出诊表")
public class DoctorWorkPlan extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer doctorId;

    private Integer deptSubId;

    private Date date;

    private Short maximum;

    private Short num;

}