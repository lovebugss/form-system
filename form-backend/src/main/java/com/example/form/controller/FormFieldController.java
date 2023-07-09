package com.example.form.controller;

import com.example.form.service.FormFieldService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 表单字段;(form_fields)表控制层
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Api(tags = "表单字段对象功能接口")
@RestController
@RequestMapping("/form/field")
public class FormFieldController {
    private final FormFieldService formFieldService;

    public FormFieldController(FormFieldService formFieldService) {
        this.formFieldService = formFieldService;
    }
}