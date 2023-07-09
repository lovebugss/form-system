package com.example.form.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.form.entity.FormFieldLogic;

/**
 * - 字段逻辑;(form_field_logic)表服务接口
 * - @author : <a [href="mailto:r979668507@gmail.com](mailto:href=%22mailto:r979668507@gmail.com)">renjp</a>
 * - @date: 2023-7-9
 */
public interface FormFieldLogicService extends IService<FormFieldLogic> {

    /*
        - 分页查询
        -
        - @param formFieldLogic 筛选条件
        - @param current 当前页码
        - @param size 每页大小
        - @return
        */
    Page<FormFieldLogic> paginQuery(FormFieldLogic formFieldLogic, long current, long size);

    /**
     * - 新增数据
     * -
     * - @param formFieldLogic 实例对象
     * - @return 实例对象
     */
    FormFieldLogic insert(FormFieldLogic formFieldLogic);

    /**
     * - 更新数据
     * -
     * - @param formFieldLogic 实例对象
     * - @return 实例对象
     */
    FormFieldLogic update(FormFieldLogic formFieldLogic);

    /**
     * - 通过主键删除数据
     * -
     * - @param id 主键
     * - @return 是否成功
     */
    boolean deleteById(Integer id);
}