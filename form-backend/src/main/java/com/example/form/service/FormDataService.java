package com.example.form.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.form.pojo.entity.FormData;
import com.example.form.pojo.req.SubmitFormDataRequest;
import com.example.form.pojo.vo.SubmitFormDataVo;

/**
 * - 表单数据;(form_data)表服务接口
 * - @author : <a [href="mailto:r979668507@gmail.com](mailto:href=%22mailto:r979668507@gmail.com)">renjp</a>
 * - @date: 2023-7-9
 */
public interface FormDataService extends IService<FormData> {

    /**
     * 提交表单数据
     *
     * @param request
     */
    SubmitFormDataVo submit(SubmitFormDataRequest request);
}