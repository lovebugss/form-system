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
 * 表单版本;
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "表单版本", description = "")
@TableName("form_versions")
@Data
public class FormVersions  extends BaseAuditEntity implements Serializable {
    /**
     * 主键ID;注解ID
     */
    @ApiModelProperty(name = "主键ID", notes = "注解ID")
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 表单ID
     */
    @ApiModelProperty(name = "表单ID", notes = "")
    private String formId;
    /**
     * 版本号
     */
    @ApiModelProperty(name = "版本号", notes = "")
    private Integer versionNumber;

}