package com.example.form.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 表单数据;
 *
 * @author : http://www.chiner.pro
 * @date : 2023-5-16
 */
@Data
@TableName("form_data")
@ApiModel(value = "表单数据", description = "")
public class FormData implements Serializable {
    /**
     * 主键ID;主键ID
     */
    @ApiModelProperty(name = "主键ID", notes = "主键ID")
    @TableId
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
    private Date createdTime;
    /**
     * 更新人;修改人
     */
    @ApiModelProperty(name = "更新人", notes = "修改人")
    private Integer updatedBy;
    /**
     * 更新时间;修改时间
     */
    @ApiModelProperty(name = "更新时间", notes = "修改时间")
    private Date updatedTime;
    /**
     * 表单项ID
     */
    @ApiModelProperty(name = "表单项ID", notes = "")
    private Integer formItemId;
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
}