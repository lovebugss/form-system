package com.example.form.pojo.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 提交表单响应实体
 *
 * @author <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date 2023/7/9 16:23
 */
@Data
@ApiModel("提交表单响应实体")
public class SubmitFormDataVo {
    // 分数
    private Double score;

}
