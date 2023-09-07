package com.example.hospital.patient.wx.api.db.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.hospital.patient.wx.api.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @className VideoDiagnose
 * @description 视频问诊订单表
 * @author: LM理智梦
 * @date: 2023/9/6
 * @version: 1.0
 */
@Data
@TableName("video_diagnose")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "VideoDiagnose对象", description = "视频问诊订单表")
public class VideoDiagnose extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer patientCardId;

    private Integer doctorId;

    private String outTradeNo;

    private BigDecimal amount;

    private Byte paymentStatus;

    private String prepayId;

    private String transactionId;

    private String expectStart;

    private String expectEnd;

    private String realStart;

    private String realEnd;

    private Byte status;

    private String createTime;

}