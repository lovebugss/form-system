package com.example.form.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.form.enums.FormStatus;
import com.example.form.enums.FormType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 表单;
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@ApiModel(value = "表单", description = "")
@TableName("form")
@Data
public class Form implements Serializable {
    /**
     * ID
     */
    @ApiModelProperty(name = "ID", notes = "")
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 表单标题
     */
    @ApiModelProperty(name = "表单标题", notes = "")
    private String formTitle;
    /**
     * 表单描述
     */
    @ApiModelProperty(name = "表单描述", notes = "")
    private String description;
    /**
     * 表单类型;表单类型
     */
    @ApiModelProperty(name = "表单类型", notes = "表单类型")
    private FormType type;
    /**
     * 表单状态
     */
    @ApiModelProperty(name = "表单状态", notes = "")
    private FormStatus status;
    /**
     * 表单开始时间
     */
    @ApiModelProperty(name = "表单开始时间", notes = "")
    private LocalDateTime startTime;
    /**
     * 表单结束时间
     */
    @ApiModelProperty(name = "表单结束时间", notes = "")
    private LocalDateTime endTime;
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

}