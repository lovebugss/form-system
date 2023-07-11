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
 * 角色菜单映射;
 *
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "角色菜单映射", description = "")
@TableName("role_menu")
@Data
public class RoleMenu extends BaseAuditEntity implements Serializable {
    /**
     * 主键ID
     */
    @ApiModelProperty(name = "主键ID", notes = "")
    @TableId
    private Integer id;

    /**
     * 角色ID
     */
    @ApiModelProperty(name = "角色ID", notes = "")
    private Integer roleId;
    /**
     * 菜单ID
     */
    @ApiModelProperty(name = "菜单ID", notes = "")
    private String menuId;

}