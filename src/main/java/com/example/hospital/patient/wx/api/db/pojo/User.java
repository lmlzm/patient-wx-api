package com.example.hospital.patient.wx.api.db.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.hospital.patient.wx.api.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @className User
 * @description 患者端用户表
 * @author: LM理智梦
 * @date: 2023/9/6
 * @version: 1.0
 */
@Data
@TableName("patient_user")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "User对象", description = "患者端用户表")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String openId;

    private String nickname;

    private String photo;

    private String sex;

    /**
     * 状态：1代表正常，2代表禁用
     */
    private byte status;

    private String createTime;
}
