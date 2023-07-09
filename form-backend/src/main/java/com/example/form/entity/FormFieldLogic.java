package com.example.form.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 字段逻辑;
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@ApiModel(value = "字段逻辑", description = "")
@TableName("form_field_logic")
@Data
public class FormFieldLogic implements Serializable {
    /**
     * 主键ID;注解ID
     */
    @ApiModelProperty(name = "主键ID", notes = "注解ID")
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 字段ID
     */
    @ApiModelProperty(name = "字段ID", notes = "")
    private Integer fieldId;
    /**
     * 条件字段ID
     */
    @ApiModelProperty(name = "条件字段ID", notes = "")
    private String conditionalFieldId;
    /**
     * 条件运算符
     */
    @ApiModelProperty(name = "条件运算符", notes = "")
    private String conditionalOperator;
    /**
     * 条件值
     */
    @ApiModelProperty(name = "条件值", notes = "")
    private String conditionalValue;
    /**
     * 计算表达式
     */
    @ApiModelProperty(name = "计算表达式", notes = "")
    private String calculationExpression;
    /**
     * 版本id
     */
    @ApiModelProperty(name = "版本id", notes = "")
    private String versionId;
    /**
     * 创建人;创建人
     */
    @ApiModelProperty(name = "创建人", notes = "创建人")
    private Integer createdBy;
    /**
     * 创建时间;创建时间
     */
    @ApiModelProperty(name = "创建时间", notes = "创建时间")
    private LocalDateTime createdTime;
    /**
     * 更新人;修改人
     */
    @ApiModelProperty(name = "更新人", notes = "修改人")
    private Integer updatedBy;
    /**
     * 更新时间;修改时间
     */
    @ApiModelProperty(name = "更新时间", notes = "修改时间")
    private LocalDateTime updatedTime;

}