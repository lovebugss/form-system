package com.example.form.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.form.entity.FormFieldTypes;

/**
 * - 表单字段类型;(form_field_types)表服务接口
 * - @author : <a [href="mailto:r979668507@gmail.com](mailto:href=%22mailto:r979668507@gmail.com)">renjp</a>
 * - @date: 2023-7-9
 */
public interface FormFieldTypesService extends IService<FormFieldTypes> {

    /*
        - 分页查询
        -
        - @param formFieldTypes 筛选条件
        - @param current 当前页码
        - @param size 每页大小
        - @return
        */
    Page<FormFieldTypes> paginQuery(FormFieldTypes formFieldTypes, long current, long size);

    /**
     * - 新增数据
     * -
     * - @param formFieldTypes 实例对象
     * - @return 实例对象
     */
    FormFieldTypes insert(FormFieldTypes formFieldTypes);

    /**
     * - 更新数据
     * -
     * - @param formFieldTypes 实例对象
     * - @return 实例对象
     */
    FormFieldTypes update(FormFieldTypes formFieldTypes);

    /**
     * - 通过主键删除数据
     * -
     * - @param id 主键
     * - @return 是否成功
     */
    boolean deleteById(Integer id);
}