package com.example.form.service.impl;

import cn.hutool.core.util.StrUtil;
import com.example.form.entity.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.example.form.mapper.FormMapper;
import com.example.form.service.FormService;
 /**
 * 表单;(form)表服务实现类
 * @author : http://www.chiner.pro
 * @date : 2023-5-16
 */
@Service
public class FormServiceImpl implements FormService{
    @Autowired
    private FormMapper formMapper;
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    public Form queryById(Integer id){
        return formMapper.selectById(id);
    }
    
    /**
     * 分页查询
     *
     * @param form 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    public Page<Form> paginQuery(Form form, long current, long size){
        //1. 构建动态查询条件
        LambdaQueryWrapper<Form> queryWrapper = new LambdaQueryWrapper<>();
        if(StrUtil.isNotBlank(form.getName())){
            queryWrapper.eq(Form::getName, form.getName());
        }
        if(StrUtil.isNotBlank(form.getDesc())){
            queryWrapper.eq(Form::getDesc, form.getDesc());
        }
        if(StrUtil.isNotBlank(form.getType())){
            queryWrapper.eq(Form::getType, form.getType());
        }
        //2. 执行分页查询
        Page<Form> pagin = new Page<>(current , size , true);
        IPage<Form> selectResult = formMapper.selectByPage(pagin , queryWrapper);
        pagin.setPages(selectResult.getPages());
        pagin.setTotal(selectResult.getTotal());
        pagin.setRecords(selectResult.getRecords());
        //3. 返回结果
        return pagin;
    }
    
    /** 
     * 新增数据
     *
     * @param form 实例对象
     * @return 实例对象
     */
    public Form insert(Form form){
        formMapper.insert(form);
        return form;
    }
    
    /** 
     * 更新数据
     *
     * @param form 实例对象
     * @return 实例对象
     */
    public Form update(Form form){
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<Form> chainWrapper = new LambdaUpdateChainWrapper<Form>(formMapper);
        if(StrUtil.isNotBlank(form.getName())){
            chainWrapper.eq(Form::getName, form.getName());
        }
        if(StrUtil.isNotBlank(form.getDesc())){
            chainWrapper.eq(Form::getDesc, form.getDesc());
        }
        if(StrUtil.isNotBlank(form.getType())){
            chainWrapper.eq(Form::getType, form.getType());
        }
        if(StrUtil.isNotBlank(form.getStatus())){
            chainWrapper.eq(Form::getStatus, form.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.set(Form::getId, form.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if(ret){
            return queryById(form.getId());
        }else{
            return form;
        }
    }
    
    /** 
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(String id){
        int total = formMapper.deleteById(id);
        return total > 0;
    }

     @Override
     public Form changeFormStatus(Integer id, String status) {
         Form form = new Form();
         form.setId(id);
         form.setStatus(status);
         return update(form);
     }
 }