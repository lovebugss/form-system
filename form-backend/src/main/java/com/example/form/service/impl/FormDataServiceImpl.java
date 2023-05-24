package com.example.form.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.form.entity.FormData;
import com.example.form.mapper.FormDataMapper;
import com.example.form.service.FormDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 表单数据;(form_data)表服务实现类
 *
 * @author : http://www.chiner.pro
 * @date : 2023-5-16
 */
@Service
public class FormDataServiceImpl implements FormDataService {
    @Autowired
    private FormDataMapper formDataMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public FormData queryById(Integer id) {
        return formDataMapper.selectById(id);
    }

    /**
     * 分页查询
     *
     * @param formData 筛选条件
     * @param current  当前页码
     * @param size     每页大小
     * @return
     */
    public Page<FormData> paginQuery(FormData formData, long current, long size) {
        //1. 构建动态查询条件
        LambdaQueryWrapper<FormData> queryWrapper = new LambdaQueryWrapper<>();
        if (StrUtil.isNotBlank(formData.getData())) {
            queryWrapper.eq(FormData::getData, formData.getData());
        }
        if (StrUtil.isNotBlank(formData.getUserId())) {
            queryWrapper.eq(FormData::getUserId, formData.getUserId());
        }
        //2. 执行分页查询
        Page<FormData> pagin = new Page<>(current, size, true);
        IPage<FormData> selectResult = formDataMapper.selectByPage(pagin, queryWrapper);
        pagin.setPages(selectResult.getPages());
        pagin.setTotal(selectResult.getTotal());
        pagin.setRecords(selectResult.getRecords());
        //3. 返回结果
        return pagin;
    }

    /**
     * 新增数据
     *
     * @param formData 实例对象
     * @return 实例对象
     */
    public FormData insert(FormData formData) {
        // 检查数据的合法性

        formDataMapper.insert(formData);
        return formData;
    }

    @Override
    public FormData batchInsert(List<FormData> formData) {
        return null;
    }

    /**
     * 更新数据
     *
     * @param formData 实例对象
     * @return 实例对象
     */
    public FormData update(FormData formData) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<FormData> chainWrapper = new LambdaUpdateChainWrapper<FormData>(formDataMapper);
        if (StrUtil.isNotBlank(formData.getData())) {
            chainWrapper.eq(FormData::getData, formData.getData());
        }
        if (StrUtil.isNotBlank(formData.getUserId())) {
            chainWrapper.eq(FormData::getUserId, formData.getUserId());
        }
        //2. 设置主键，并更新
        chainWrapper.set(FormData::getId, formData.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(formData.getId());
        } else {
            return formData;
        }
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Integer id) {
        int total = formDataMapper.deleteById(id);
        return total > 0;
    }
}