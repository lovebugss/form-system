package com.example.form.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.form.entity.FormItem;

/**
 * 表单项;(form_item)表服务接口
 *
 * @author : http://www.chiner.pro
 * @date : 2023-5-16
 */
public interface FormItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FormItem queryById(Integer id);

    /**
     * 分页查询
     *
     * @param formItem 筛选条件
     * @param current  当前页码
     * @param size     每页大小
     * @return
     */
    Page<FormItem> paginQuery(FormItem formItem, long current, long size);

    /**
     * 新增数据
     *
     * @param formItem 实例对象
     * @return 实例对象
     */
    FormItem insert(FormItem formItem);

    /**
     * 更新数据
     *
     * @param formItem 实例对象
     * @return 实例对象
     */
    FormItem update(FormItem formItem);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
}