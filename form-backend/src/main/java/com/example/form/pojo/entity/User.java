package com.example.form.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户;
 *
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用户", description = "")
@TableName("user")
@Data
public class User extends BaseAuditEntity implements Serializable {

    /**
     * 主键ID
     */
    @ApiModelProperty(name = "主键ID", notes = "")
    @TableId
    private Integer id;
    /**
     * 用户名称
     */
    @ApiModelProperty(name = "用户名称", notes = "")
    private String username;
    /**
     * 密码
     */
    @ApiModelProperty(name = "密码", notes = "")
    private String password;
    /**
     * 盐值
     */
    private String slat;
    /**
     * 是否禁用
     */
    @ApiModelProperty(name = "是否禁用", notes = "")
    private Boolean disabled;


}