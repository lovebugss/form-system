package com.example.form.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.form.entity.Form;

/**
 * 表单;(form)表服务接口
 * @author : http://www.chiner.pro
 * @date : 2023-5-16
 */
public interface FormService{
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    Form queryById(Integer id);
    
    /**
     * 分页查询
     *
     * @param form 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    Page<Form> paginQuery(Form form, long current, long size);
    /** 
     * 新增数据
     *
     * @param form 实例对象
     * @return 实例对象
     */
    Form insert(Form form);
    /** 
     * 更新数据
     *
     * @param form 实例对象
     * @return 实例对象
     */
    Form update(Form form);
    /** 
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    Form changeFormStatus(Integer id, String status);
}