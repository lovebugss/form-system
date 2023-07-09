package com.example.form.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

 /**
 * 用户角色映射;
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@ApiModel(value = "用户角色映射",description = "")
@TableName("user_role")
@Data
public class UserRole implements Serializable{
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
    /** 用户ID */
    @ApiModelProperty(name = "用户ID",notes = "")
    private Integer userId ;
    /** 角色ID */
    @ApiModelProperty(name = "角色ID",notes = "")
    private String roleId ;

}