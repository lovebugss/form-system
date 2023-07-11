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
 * 角色;
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "角色",description = "")
@TableName("role")
@Data
public class Role extends BaseAuditEntity  implements Serializable{
    /** 主键ID */
    @ApiModelProperty(name = "主键ID",notes = "")
    @TableId
    private Integer id ;

    /** 角色名称 */
    @ApiModelProperty(name = "角色名称",notes = "")
    private String name ;

}