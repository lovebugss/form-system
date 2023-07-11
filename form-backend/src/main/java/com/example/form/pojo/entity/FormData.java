package com.example.form.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 表单数据;
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@ApiModel(value = "表单数据", description = "")
@TableName("form_data")
@Data
public class FormData extends BaseAuditEntity implements Serializable {
    /**
     * 主键ID;注解ID
     */
    @ApiModelProperty(name = "主键ID", notes = "注解ID")
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 表单项ID
     */
    @ApiModelProperty(name = "表单项ID", notes = "")
    private Integer fieldId;
    /**
     * 内容
     */
    @ApiModelProperty(name = "内容", notes = "")
    private String data;
    /**
     * 用户
     */
    @ApiModelProperty(name = "用户", notes = "")
    private String userId;
    /**
     * 版本ID
     */
    @ApiModelProperty(name = "版本ID", notes = "")
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