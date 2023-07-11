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
 * 菜单;
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "菜单",description = "")
@TableName("menu")
@Data
public class Menu  extends BaseAuditEntity implements Serializable{
    /** 主键ID */
    @ApiModelProperty(name = "主键ID",notes = "")
    @TableId
    private Integer id ;

    /** 菜单名称 */
    @ApiModelProperty(name = "菜单名称",notes = "")
    private String name ;
    /** icon */
    @ApiModelProperty(name = "icon",notes = "")
    private String icon ;
    /** 路径 */
    @ApiModelProperty(name = "路径",notes = "")
    private String path ;
    /** 父ID */
    @ApiModelProperty(name = "父ID",notes = "")
    private String parentId ;

}