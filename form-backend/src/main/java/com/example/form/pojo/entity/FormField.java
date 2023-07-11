package com.example.form.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.form.enums.FieldType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 表单字段;
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "表单字段", description = "")
@TableName("form_fields")
@Data
public class FormField extends BaseAuditEntity  implements Serializable {
    /**
     * 主键ID
     */
    @ApiModelProperty(name = "主键ID", notes = "")
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 表单ID
     */
    @ApiModelProperty(name = "表单ID", notes = "")
    private Integer formId;
    /**
     * key
     */
    private String formKey;
    /**
     * 版本ID
     */
    @ApiModelProperty(name = "版本ID", notes = "")
    private String versionId;
    /**
     * 字段类型
     */
    @ApiModelProperty(name = "字段类型", notes = "")
    private FieldType fieldType;
    /**
     * 字段名称;字段名称
     */
    @ApiModelProperty(name = "字段名称", notes = "字段名称")
    private String fieldName;
    /**
     * 是否必填;是否必填
     */
    @ApiModelProperty(name = "是否必填", notes = "是否必填")
    private boolean required;
    /**
     * 地址
     */
    @ApiModelProperty(name = "地址", notes = "")
    private String apiEndpoint;
    /**
     * 描述信息;描述信息
     */
    @ApiModelProperty(name = "描述信息", notes = "描述信息")
    private String fieldDesc;
    /**
     * 分值
     */
    @ApiModelProperty(name = "分值", notes = "")
    private Double score;
    /**
     * 提示信息;提示信息
     */
    @ApiModelProperty(name = "提示信息", notes = "提示信息")
    private String tip;
    /**
     * 顺序
     */
    @ApiModelProperty(name = "顺序", notes = "")
    private Integer order;

}