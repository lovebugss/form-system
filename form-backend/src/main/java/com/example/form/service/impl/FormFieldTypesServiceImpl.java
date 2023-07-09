package com.example.form.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.form.entity.FormFieldTypes;
import com.example.form.mapper.FormFieldTypesMapper;
import com.example.form.service.FormFieldTypesService;
import org.springframework.stereotype.Service;

/**
 * 表单字段类型;(form_field_types)表服务实现类
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Service
public class FormFieldTypesServiceImpl extends ServiceImpl<FormFieldTypesMapper, FormFieldTypes> implements FormFieldTypesService {

    /**
     * 分页查询
     *
     * @param formFieldTypes 筛选条件
     * @param current        当前页码
     * @param size           每页大小
     * @return
     */
    @Override
    public Page<FormFieldTypes> paginQuery(FormFieldTypes formFieldTypes, long current, long size) {
        //1. 构建动态查询条件
        LambdaQueryWrapper<FormFieldTypes> queryWrapper = new LambdaQueryWrapper<>();
        if (StrUtil.isNotBlank(formFieldTypes.getTypeName())) {
            queryWrapper.eq(FormFieldTypes::getTypeName, formFieldTypes.getTypeName());
        }
        if (StrUtil.isNotBlank(formFieldTypes.getTypeGroup())) {
            queryWrapper.eq(FormFieldTypes::getTypeGroup, formFieldTypes.getTypeGroup());
        }
        //2. 执行分页查询
        Page<FormFieldTypes> pagin = new Page<>(current, size, true);
        IPage<FormFieldTypes> selectResult = this.baseMapper.selectByPage(pagin, queryWrapper);
        pagin.setPages(selectResult.getPages());
        pagin.setTotal(selectResult.getTotal());
        pagin.setRecords(selectResult.getRecords());
        //3. 返回结果
        return pagin;
    }

    /**
     * 新增数据
     *
     * @param formFieldTypes 实例对象
     * @return 实例对象
     */
    @Override
    public FormFieldTypes insert(FormFieldTypes formFieldTypes) {
        this.baseMapper.insert(formFieldTypes);
        return formFieldTypes;
    }

    /**
     * 更新数据
     *
     * @param formFieldTypes 实例对象
     * @return 实例对象
     */
    @Override
    public FormFieldTypes update(FormFieldTypes formFieldTypes) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<FormFieldTypes> chainWrapper = new LambdaUpdateChainWrapper<FormFieldTypes>(this.baseMapper);
        if (StrUtil.isNotBlank(formFieldTypes.getTypeName())) {
            chainWrapper.eq(FormFieldTypes::getTypeName, formFieldTypes.getTypeName());
        }
        if (StrUtil.isNotBlank(formFieldTypes.getTypeGroup())) {
            chainWrapper.eq(FormFieldTypes::getTypeGroup, formFieldTypes.getTypeGroup());
        }
        //2. 设置主键，并更新
        chainWrapper.set(FormFieldTypes::getId, formFieldTypes.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return getById(formFieldTypes.getId());
        } else {
            return formFieldTypes;
        }
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        int total = this.baseMapper.deleteById(id);
        return total > 0;
    }
}