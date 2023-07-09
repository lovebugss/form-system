package com.example.form.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

 /**
 * 菜单;
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@ApiModel(value = "菜单",description = "")
@TableName("menu")
@Data
public class Menu implements Serializable{
    /** 主键ID */
    @ApiModelProperty(name = "主键ID",notes = "")
    @TableId
    private Integer id ;
    /** 创建人 */
    @ApiModelProperty(name = "创建人",notes = "")
    private Integer createdBy ;
    /** 创建时间 */
    @ApiModelProperty(name = "创建时间",notes = "")
    private LocalDateTime createdTime ;
    /** 更新人 */
    @ApiModelProperty(name = "更新人",notes = "")
    private Integer updatedBy ;
    /** 更新时间 */
    @ApiModelProperty(name = "更新时间",notes = "")
    private LocalDateTime updatedTime ;
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