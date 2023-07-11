package com.example.form.pojo.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author r9796
 */
@Getter
@Setter
public class BaseAuditEntity {
    /**
     * 创建人
     */
    @ApiModelProperty(name = "创建人", notes = "")
    protected Integer createdBy;
    /**
     * 创建时间
     */
    @ApiModelProperty(name = "创建时间", notes = "")
    protected LocalDateTime createdTime;
    /**
     * 更新人
     */
    @ApiModelProperty(name = "更新人", notes = "")
    protected Integer updatedBy;
    /**
     * 更新时间
     */
    @ApiModelProperty(name = "更新时间", notes = "")
    protected LocalDateTime updatedTime;
}
