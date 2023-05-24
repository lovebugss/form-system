package com.example.form.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.form.entity.FormItem;
import com.example.form.mapper.FormItemMapper;
import com.example.form.service.FormItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 表单项;(form_item)表服务实现类
 *
 * @author : http://www.chiner.pro
 * @date : 2023-5-16
 */
@Service
public class FormItemServiceImpl implements FormItemService {
    @Autowired
    private FormItemMapper formItemMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public FormItem queryById(Integer id) {
        return formItemMapper.selectById(id);
    }

    /**
     * 分页查询
     *
     * @param formItem 筛选条件
     * @param current  当前页码
     * @param size     每页大小
     * @return
     */
    public Page<FormItem> paginQuery(FormItem formItem, long current, long size) {
        //1. 构建动态查询条件
        LambdaQueryWrapper<FormItem> queryWrapper = new LambdaQueryWrapper<>();
        if (StrUtil.isNotBlank(formItem.getName())) {
            queryWrapper.eq(FormItem::getName, formItem.getName());
        }
        if (StrUtil.isNotBlank(formItem.getDesc())) {
            queryWrapper.eq(FormItem::getDesc, formItem.getDesc());
        }
        if (StrUtil.isNotBlank(formItem.getTip())) {
            queryWrapper.eq(FormItem::getTip, formItem.getTip());
        }
        if (Boolean.TRUE.equals(formItem.getRequired())) {
            queryWrapper.eq(FormItem::getRequired, formItem.getRequired());
        }
        if (StrUtil.isNotBlank(formItem.getItemType())) {
            queryWrapper.eq(FormItem::getItemType, formItem.getItemType());
        }
        //2. 执行分页查询
        Page<FormItem> pagin = new Page<>(current, size, true);
        IPage<FormItem> selectResult = formItemMapper.selectByPage(pagin, queryWrapper);
        pagin.setPages(selectResult.getPages());
        pagin.setTotal(selectResult.getTotal());
        pagin.setRecords(selectResult.getRecords());
        //3. 返回结果
        return pagin;
    }

    /**
     * 新增数据
     *
     * @param formItem 实例对象
     * @return 实例对象
     */
    public FormItem insert(FormItem formItem) {
        formItemMapper.insert(formItem);
        return formItem;
    }

    /**
     * 更新数据
     *
     * @param formItem 实例对象
     * @return 实例对象
     */
    public FormItem update(FormItem formItem) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<FormItem> chainWrapper = new LambdaUpdateChainWrapper<FormItem>(formItemMapper);
        if (StrUtil.isNotBlank(formItem.getName())) {
            chainWrapper.eq(FormItem::getName, formItem.getName());
        }
        if (StrUtil.isNotBlank(formItem.getDesc())) {
            chainWrapper.eq(FormItem::getDesc, formItem.getDesc());
        }
        if (StrUtil.isNotBlank(formItem.getTip())) {
            chainWrapper.eq(FormItem::getTip, formItem.getTip());
        }
        if (Boolean.TRUE.equals(formItem.getRequired())) {
            chainWrapper.eq(FormItem::getRequired, formItem.getRequired());
        }
        if (StrUtil.isNotBlank(formItem.getItemType())) {
            chainWrapper.eq(FormItem::getItemType, formItem.getItemType());
        }
        //2. 设置主键，并更新
        chainWrapper.set(FormItem::getId, formItem.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(formItem.getId());
        } else {
            return formItem;
        }
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Integer id) {
        int total = formItemMapper.deleteById(id);
        return total > 0;
    }
}