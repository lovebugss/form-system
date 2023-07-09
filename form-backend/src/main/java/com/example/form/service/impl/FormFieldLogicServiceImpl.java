package com.example.form.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.form.entity.FormFieldLogic;
import com.example.form.mapper.FormFieldLogicMapper;
import com.example.form.service.FormFieldLogicService;
import org.springframework.stereotype.Service;

/**
 * 字段逻辑;(form_field_logic)表服务实现类
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Service
public class FormFieldLogicServiceImpl extends ServiceImpl<FormFieldLogicMapper, FormFieldLogic> implements FormFieldLogicService {

    /**
     * 分页查询
     *
     * @param formFieldLogic 筛选条件
     * @param current        当前页码
     * @param size           每页大小
     * @return
     */
    @Override
    public Page<FormFieldLogic> paginQuery(FormFieldLogic formFieldLogic, long current, long size) {
        //1. 构建动态查询条件
        LambdaQueryWrapper<FormFieldLogic> queryWrapper = new LambdaQueryWrapper<>();
        if (StrUtil.isNotBlank(formFieldLogic.getConditionalFieldId())) {
            queryWrapper.eq(FormFieldLogic::getConditionalFieldId, formFieldLogic.getConditionalFieldId());
        }
        if (StrUtil.isNotBlank(formFieldLogic.getConditionalOperator())) {
            queryWrapper.eq(FormFieldLogic::getConditionalOperator, formFieldLogic.getConditionalOperator());
        }
        if (StrUtil.isNotBlank(formFieldLogic.getConditionalValue())) {
            queryWrapper.eq(FormFieldLogic::getConditionalValue, formFieldLogic.getConditionalValue());
        }
        if (StrUtil.isNotBlank(formFieldLogic.getCalculationExpression())) {
            queryWrapper.eq(FormFieldLogic::getCalculationExpression, formFieldLogic.getCalculationExpression());
        }
        if (StrUtil.isNotBlank(formFieldLogic.getVersionId())) {
            queryWrapper.eq(FormFieldLogic::getVersionId, formFieldLogic.getVersionId());
        }
        //2. 执行分页查询
        Page<FormFieldLogic> pagin = new Page<>(current, size, true);
        IPage<FormFieldLogic> selectResult = this.baseMapper.selectByPage(pagin, queryWrapper);
        pagin.setPages(selectResult.getPages());
        pagin.setTotal(selectResult.getTotal());
        pagin.setRecords(selectResult.getRecords());
        //3. 返回结果
        return pagin;
    }

    /**
     * 新增数据
     *
     * @param formFieldLogic 实例对象
     * @return 实例对象
     */
    @Override
    public FormFieldLogic insert(FormFieldLogic formFieldLogic) {
        this.baseMapper.insert(formFieldLogic);
        return formFieldLogic;
    }

    /**
     * 更新数据
     *
     * @param formFieldLogic 实例对象
     * @return 实例对象
     */
    @Override
    public FormFieldLogic update(FormFieldLogic formFieldLogic) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<FormFieldLogic> chainWrapper = new LambdaUpdateChainWrapper<FormFieldLogic>(this.baseMapper);
        if (StrUtil.isNotBlank(formFieldLogic.getConditionalFieldId())) {
            chainWrapper.eq(FormFieldLogic::getConditionalFieldId, formFieldLogic.getConditionalFieldId());
        }
        if (StrUtil.isNotBlank(formFieldLogic.getConditionalOperator())) {
            chainWrapper.eq(FormFieldLogic::getConditionalOperator, formFieldLogic.getConditionalOperator());
        }
        if (StrUtil.isNotBlank(formFieldLogic.getConditionalValue())) {
            chainWrapper.eq(FormFieldLogic::getConditionalValue, formFieldLogic.getConditionalValue());
        }
        if (StrUtil.isNotBlank(formFieldLogic.getCalculationExpression())) {
            chainWrapper.eq(FormFieldLogic::getCalculationExpression, formFieldLogic.getCalculationExpression());
        }
        if (StrUtil.isNotBlank(formFieldLogic.getVersionId())) {
            chainWrapper.eq(FormFieldLogic::getVersionId, formFieldLogic.getVersionId());
        }
        //2. 设置主键，并更新
        chainWrapper.set(FormFieldLogic::getId, formFieldLogic.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return getById(formFieldLogic.getId());
        } else {
            return formFieldLogic;
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