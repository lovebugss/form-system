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
 * 表单字段类型;
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@ApiModel(value = "表单字段类型", description = "")
@TableName("form_field_types")
@Data
public class FormFieldTypes implements Serializable {
    /**
     * 主键ID;注解ID
     */
    @ApiModelProperty(name = "主键ID", notes = "注解ID")
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 类型名称
     */
    @ApiModelProperty(name = "类型名称", notes = "")
    private String typeName;
    /**
     * 分组
     */
    @ApiModelProperty(name = "分组", notes = "")
    private String typeGroup;
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