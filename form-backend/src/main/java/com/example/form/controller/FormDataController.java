package com.example.form.controller;

import com.example.form.pojo.req.SubmitFormDataRequest;
import com.example.form.pojo.vo.SubmitFormDataVo;
import com.example.form.result.Result;
import com.example.form.service.FormDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 表单数据;(form_data)表控制层
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Api(tags = "表单数据对象功能接口")
@RestController
@RequestMapping("/form/data")
public class FormDataController {
    @Autowired
    private FormDataService formDataService;

    /**
     * 提交表单数据
     */
    @ApiOperation(value = "提交表单数据")
    @PostMapping("/")
    public Result<SubmitFormDataVo> submitFormData(@RequestBody SubmitFormDataRequest request) {
        SubmitFormDataVo resp = formDataService.submit(request);
        return Result.success(resp);
    }
}