package com.example.form.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@ApiModel(value = "表单项规则", description = "")
@TableName("form_item_rule")
public class FormItemRule {
    /**
     * 主键ID
     */
    @ApiModelProperty(name = "主键ID", notes = "")
    @TableId
    private Integer id;
    /**
     * 表单ID
     */
    @ApiModelProperty(name = "表单项ID", notes = "")
    private Integer formItemId;
    //defaultField	仅在 type 为 array 类型时有效，用于指定数组元素的校验规则	rule
    //enum	是否匹配枚举中的值（需要将 type 设置为 enum）	any[]
    private List<String> enums;
    //fields	仅在 type 为 array 或 object 类型时有效，用于指定子元素的校验规则	Record<string, rule>
    private Map<String, FormItem> fields;
    //len	string 类型时为字符串长度；number 类型时为确定数字； array 类型时为数组长度	number
    private Integer len;
    //max	必须设置 type：string 类型为字符串最大长度；number 类型时为最大值；array 类型时为数组最大长度	number
    private Integer max;
    //message	错误信息，不设置时会通过模板自动生成	string
    //min	必须设置 type：string 类型为字符串最小长度；number 类型时为最小值；array 类型时为数组最小长度	number
    private Integer min;
    //pattern	正则表达式匹配	RegExp
    private String pattern;
    //required	是否为必选字段	boolean
    private boolean required;
    //transform	将字段值转换成目标值后进行校验	(value) => any
    //type	类型，常见有 string |number |boolean |url | email。更多请参考此处	string
    //validateTrigger	设置触发验证时机，必须是 Form.Item 的 validateTrigger 的子集	string | string[]
    //validator	自定义校验，接收 Promise 作为返回值。示例参考	(rule, value) => Promise
    //warningOnly	仅警告，不阻塞表单提交	boolean	4.17.0
    //whitespace	如果字段仅包含空格则校验不通过，只在 type: 'string' 时生效
}
