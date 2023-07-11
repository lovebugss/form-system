package com.example.form.service.form.parser;

import com.example.form.pojo.dto.CreateFormDTO;

/**
 * 表单scheme 解析器
 * <p>
 * 主要为了适应不同的保单设计器, 将不同表单设计器的scheme解析为统一的格式
 *
 * @author r9796
 */
public interface FormDesignerSchemeParser {


    /**
     * 解析表单scheme
     *
     * @param scheme 表单scheme
     * @return 解析后的表单scheme
     */
    CreateFormDTO parse(String scheme);

    FormSchemeType schemeType();

}
