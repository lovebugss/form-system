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
 * 字段规则;
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@ApiModel(value = "字段规则", description = "")
@TableName("form_field_rule")
@Data
public class FormFieldRule implements Serializable {
    /**
     * 主键ID;主键ID
     */
    @ApiModelProperty(name = "主键ID", notes = "主键ID")
    @TableId(type = IdType.AUTO)
    private Integer id;
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