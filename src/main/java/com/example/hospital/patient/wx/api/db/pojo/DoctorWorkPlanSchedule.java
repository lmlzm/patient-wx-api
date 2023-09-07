package com.example.hospital.patient.wx.api.db.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.hospital.patient.wx.api.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @className DoctorWorkPlanSchedule
 * @description 医生出诊时间段表
 * @author: LM理智梦
 * @date: 2023/9/6
 * @version: 1.0
 */
@Data
@TableName("doctor_work_plan_schedule")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DoctorWorkPlanSchedule对象", description = "医生出诊时间段表")
public class DoctorWorkPlanSchedule extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer workPlanId;

    private Byte slot;

    private Short maximum;

    private Short num;

}