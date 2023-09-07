package com.example.hospital.patient.wx.api.db.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.hospital.patient.wx.api.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @className DoctorPrescription
 * @description 医生处方表
 * @author: LM理智梦
 * @date: 2023/9/6
 * @version: 1.0
 */
@Data
@TableName("docker_prescription")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DoctorPrescription对象", description = "医生处方表")
public class DoctorPrescription extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String uuid;

    private Integer patientCardId;
    /**
     * 诊断结果
     */
    private String diagnosis;

    private Integer subDeptId;

    private Integer doctorId;

    private Integer registrationId;
    /**
     * 处方
     */
    private String rp;

}