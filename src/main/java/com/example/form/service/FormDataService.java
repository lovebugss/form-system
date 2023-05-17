package com.example.form.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.form.entity.FormData;

import java.util.List;

/**
 * 表单数据;(form_data)表服务接口
 * @author : http://www.chiner.pro
 * @date : 2023-5-16
 */
public interface FormDataService{
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    FormData queryById(Integer id);
    
    /**
     * 分页查询
     *
     * @param formData 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    Page<FormData> paginQuery(FormData formData, long current, long size);
    /** 
     * 新增数据
     *
     * @param formData 实例对象
     * @return 实例对象
     */
    FormData insert(FormData formData);
    /** 
     * 更新数据
     *
     * @param formData 实例对象
     * @return 实例对象
     */
    FormData update(FormData formData);
    /** 
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    FormData batchInsert(List<FormData> formData);
 }