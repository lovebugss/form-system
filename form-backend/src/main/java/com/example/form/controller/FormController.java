package com.example.form.controller;

import com.example.form.service.form.parser.FormSchemeType;
import com.example.form.pojo.dto.CreateFormDTO;
import com.example.form.result.Result;
import com.example.form.service.FormService;
import com.example.form.service.form.parser.InvalidSchemeParser;
import com.example.form.service.form.parser.FormDesignerSchemeParser;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

/**
 * 表单;(form)表控制层
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Api(tags = "表单对象功能接口")
@RestController
@RequestMapping("/form")
public class FormController {
    private final FormService formService;
    private final Map<FormSchemeType, FormDesignerSchemeParser> formDesignerSchemeParserMap;

    public FormController(FormService formService, List<FormDesignerSchemeParser> formDesignerSchemeParsers) {
        this.formService = formService;
        this.formDesignerSchemeParserMap = formDesignerSchemeParsers
                .stream()
                .collect(
                        toMap(FormDesignerSchemeParser::schemeType, Function.identity()));
    }

    /**
     * @param schemeType 表单类型
     * @param scheme     表单scheme
     * @return
     */
    @PostMapping("{schemeType}")
    public Result<Void> submitForm(@PathVariable String schemeType, @RequestBody String scheme) {
        // 解析表单数据
        CreateFormDTO form = formDesignerSchemeParserMap
                .getOrDefault(FormSchemeType.valueOf(schemeType), new InvalidSchemeParser())
                .parse(scheme);
        // 提交表单数据
        formService.create(form);
        return Result.success();
    }
}