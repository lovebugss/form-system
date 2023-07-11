package com.example.form.pojo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户角色映射;
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用户角色映射",description = "")
@TableName("user_role")
@Data
public class UserRole  extends BaseAuditEntity implements Serializable{
    /** 主键ID */
    @ApiModelProperty(name = "主键ID",notes = "")
    @TableId
    private Integer id ;
    /** 用户ID */
    @ApiModelProperty(name = "用户ID",notes = "")
    private Integer userId ;
    /** 角色ID */
    @ApiModelProperty(name = "角色ID",notes = "")
    private String roleId ;

}