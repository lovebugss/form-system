package com.example.form.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.form.pojo.entity.FormVersions;
import com.example.form.mapper.FormVersionsMapper;
import com.example.form.service.FormVersionsService;
import org.springframework.stereotype.Service;

/**
 * 表单版本;(form_versions)表服务实现类
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Service
public class FormVersionsServiceImpl extends ServiceImpl<FormVersionsMapper, FormVersions> implements FormVersionsService {

}