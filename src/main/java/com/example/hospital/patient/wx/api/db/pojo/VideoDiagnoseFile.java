package com.example.hospital.patient.wx.api.db.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.hospital.patient.wx.api.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @className VideoDiagnoseFile
 * @description 视频问诊资料表
 * @author: LM理智梦
 * @date: 2023/9/6
 * @version: 1.0
 */
@Data
@TableName("video_diagnose_file")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "VideoDiagnoseFile对象", description = "视频问诊资料表")
public class VideoDiagnoseFile extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer videoDiagnoseId;

    private String filename;

    private String path;

    private String createTime;
}