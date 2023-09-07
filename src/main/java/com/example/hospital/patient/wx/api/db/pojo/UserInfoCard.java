package com.example.hospital.patient.wx.api.db.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.hospital.patient.wx.api.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @className UserInfoCard
 * @description 患者端用户基本信息表
 * @author: LM理智梦
 * @date: 2023/9/6
 * @version: 1.0
 */
@Data
@TableName("patient_user_info_card")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "UserInfoCard对象", description = "患者端用户基本信息表")
public class UserInfoCard extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private String uuid;

    private String name;

    private String sex;

    private String pid;

    private String tel;

    private String birthday;

    private String medicalHistory;

    private String insuranceType;

    private Boolean existFaceModel;
}
