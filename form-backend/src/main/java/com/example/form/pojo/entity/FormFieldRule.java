package com.example.form.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 字段规则;
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "字段规则", description = "")
@TableName("form_field_rule")
@Data
public class FormFieldRule extends BaseAuditEntity  implements Serializable {
    /**
     * 主键ID;主键ID
     */
    @ApiModelProperty(name = "主键ID", notes = "主键ID")
    @TableId(type = IdType.AUTO)
    private Integer id;


}