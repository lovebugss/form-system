package com.example.form.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

 /**
 * 用户;
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@ApiModel(value = "用户",description = "")
@TableName("user")
@Data
public class User implements Serializable
 {
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
    /** 用户名称 */
    @ApiModelProperty(name = "用户名称",notes = "")
    private String username ;
    /** 密码 */
    @ApiModelProperty(name = "密码",notes = "")
    private String password ;
    /** 是否禁用 */
    @ApiModelProperty(name = "是否禁用",notes = "")
    private String disabled ;

}