package com.example.hospital.patient.wx.api.db.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.hospital.patient.wx.api.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @className Doctor
 * @description 医生表
 * @author: LM理智梦
 * @date: 2023/9/6
 * @version: 1.0
 */
@Data
@TableName("docker")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Doctor对象", description = "医生表")
public class Doctor extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;

    private String pid;

    private String uuid;

    private String sex;

    private String photo;

    private String birthday;

    private String school;
    /**
     * 学历
     */
    private String degree;

    private String tel;

    private String address;

    private String email;

    private String job;

    private String remark;

    private String description;
    /**
     * 入职日期
     */
    private String hiredate;

    private String tag;

    private Boolean recommended;

    /**
     * 1在职,2离职,3退休,4隐藏(逻辑删除)
     */
    private Integer status;
}