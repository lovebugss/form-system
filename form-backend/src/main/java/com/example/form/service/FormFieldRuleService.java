package com.example.form.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.form.entity.FormFieldRule;

/**
 * - 字段规则;(form_field_rule)表服务接口
 * - @author : <a [href="mailto:r979668507@gmail.com](mailto:href=%22mailto:r979668507@gmail.com)">renjp</a>
 * - @date: 2023-7-9
 */
public interface FormFieldRuleService extends IService<FormFieldRule> {

    /*
        - 分页查询
        -
        - @param formFieldRule 筛选条件
        - @param current 当前页码
        - @param size 每页大小
        - @return
        */
    Page<FormFieldRule> paginQuery(FormFieldRule formFieldRule, long current, long size);

    /**
     * - 新增数据
     * -
     * - @param formFieldRule 实例对象
     * - @return 实例对象
     */
    FormFieldRule insert(FormFieldRule formFieldRule);

    /**
     * - 更新数据
     * -
     * - @param formFieldRule 实例对象
     * - @return 实例对象
     */
    FormFieldRule update(FormFieldRule formFieldRule);

    /**
     * - 通过主键删除数据
     * -
     * - @param id 主键
     * - @return 是否成功
     */
    boolean deleteById(Integer id);
}