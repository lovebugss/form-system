package com.example.form.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 表单;
 *
 * @author : http://www.chiner.pro
 * @date : 2023-5-16
 */
@Data
@ApiModel(value = "表单", description = "")
@TableName("form")
public class Form implements Serializable {
    /**
     * ID
     */
    @ApiModelProperty(name = "ID", notes = "ID")
    private Integer id;
    /**
     * 创建人
     */
    @ApiModelProperty(name = "创建人", notes = "创建人")
    private Integer createdBy;
    /**
     * 创建时间
     */
    @ApiModelProperty(name = "创建时间", notes = "创建时间")
    private LocalDateTime createdTime;
    /**
     * 更新人
     */
    @ApiModelProperty(name = "更新人", notes = "更新人")
    private Integer updatedBy;
    /**
     * 更新时间
     */
    @ApiModelProperty(name = "更新时间", notes = "更新时间")
    private LocalDateTime updatedTime;
    /**
     * 表单名称
     */
    @ApiModelProperty(name = "表单名称", notes = "表单名称")
    private String name;
    /**
     * 表单描述
     */
    @ApiModelProperty(name = "表单描述", notes = "表单描述")
    private String desc;
    /**
     * 表单类型;表单类型
     */
    @ApiModelProperty(name = "表单类型", notes = "表单类型")
    private String type;

    /**
     * 表单状态， 草稿， 发布中， 停止使用
     */
    @ApiModelProperty(name = "表单状态", notes = "表单状态")
    private String status;

    /**
     * 表达过期时间
     */
    @ApiModelProperty(name = "表单过期时间", notes = "表单过期时间")
    private LocalDateTime expireTime;
}