package com.example.form.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 表单项;
 *
 * @author : http://www.chiner.pro
 * @date : 2023-5-16
 */
@Data
@ApiModel(value = "表单项", description = "")
@TableName("form_item")
public class FormItem implements Serializable, Cloneable {
    /**
     * 主键ID
     */
    @ApiModelProperty(name = "主键ID", notes = "")
    @TableId
    private Integer id;
    /**
     * 表单ID
     */
    @ApiModelProperty(name = "表单ID", notes = "")
    private Integer formId;
    /**
     * 创建人
     */
    @ApiModelProperty(name = "创建人", notes = "")
    private Integer createdBy;
    /**
     * 创建时间
     */
    @ApiModelProperty(name = "创建时间", notes = "")
    private LocalDateTime createdTime;
    /**
     * 更新人
     */
    @ApiModelProperty(name = "更新人", notes = "")
    private Integer updatedBy;
    /**
     * 更新时间
     */
    @ApiModelProperty(name = "更新时间", notes = "")
    private LocalDateTime updatedTime;
    /**
     * 字段名称;字段名称
     */
    @ApiModelProperty(name = "字段名称", notes = "字段名称")
    private String name;
    /**
     * 描述信息;描述信息
     */
    @ApiModelProperty(name = "描述信息", notes = "描述信息")
    private String desc;
    /**
     * 提示信息;提示信息
     */
    @ApiModelProperty(name = "提示信息", notes = "提示信息")
    private String tip;
    /**
     * 是否必填;是否必填
     */
    @ApiModelProperty(name = "是否必填", notes = "是否必填")
    private Boolean required;
    /**
     * 字段类型
     */
    @ApiModelProperty(name = "字段类型", notes = "")
    private String itemType;
    /**
     * 顺序
     */
    @ApiModelProperty(name = "顺序", notes = "")
    private Integer order;

    /**
     * label
     */
    @ApiModelProperty(name = "label", notes = "")
    private Integer label;


}