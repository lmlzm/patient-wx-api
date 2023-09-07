package com.example.hospital.patient.wx.api.db.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.hospital.patient.wx.api.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @className MedicalRegistration
 * @description 挂号表
 * @author: LM理智梦
 * @date: 2023/9/6
 * @version: 1.0
 */
@Data
@TableName("medical_registration")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "MedicalRegistration对象", description = "挂号表")
public class MedicalRegistration extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer patientCardId;

    private Integer workPlanId;

    private Integer doctorScheduleId;

    private Integer doctorId;

    private Integer deptSubId;

    private String date;

    private Integer slot;

    private BigDecimal amount;

    private String outTradeNo;

    private String prepayId;

    private String transactionId;

    private Byte paymentStatus;

    private Date createTime;
}