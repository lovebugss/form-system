package com.example.form.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.form.entity.FormFieldRule;
import com.example.form.mapper.FormFieldRuleMapper;
import com.example.form.service.FormFieldRuleService;
import org.springframework.stereotype.Service;

/**
 * 字段规则;(form_field_rule)表服务实现类
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Service
public class FormFieldRuleServiceImpl extends ServiceImpl<FormFieldRuleMapper, FormFieldRule> implements FormFieldRuleService {

    /**
     * 分页查询
     *
     * @param formFieldRule 筛选条件
     * @param current       当前页码
     * @param size          每页大小
     * @return
     */
    @Override
    public Page<FormFieldRule> paginQuery(FormFieldRule formFieldRule, long current, long size) {
        //1. 构建动态查询条件
        LambdaQueryWrapper<FormFieldRule> queryWrapper = new LambdaQueryWrapper<>();
        //2. 执行分页查询
        Page<FormFieldRule> pagin = new Page<>(current, size, true);
        IPage<FormFieldRule> selectResult = this.baseMapper.selectByPage(pagin, queryWrapper);
        pagin.setPages(selectResult.getPages());
        pagin.setTotal(selectResult.getTotal());
        pagin.setRecords(selectResult.getRecords());
        //3. 返回结果
        return pagin;
    }

    /**
     * 新增数据
     *
     * @param formFieldRule 实例对象
     * @return 实例对象
     */
    @Override
    public FormFieldRule insert(FormFieldRule formFieldRule) {
        this.baseMapper.insert(formFieldRule);
        return formFieldRule;
    }

    /**
     * 更新数据
     *
     * @param formFieldRule 实例对象
     * @return 实例对象
     */
    @Override
    public FormFieldRule update(FormFieldRule formFieldRule) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<FormFieldRule> chainWrapper = new LambdaUpdateChainWrapper<FormFieldRule>(this.baseMapper);
        //2. 设置主键，并更新
        chainWrapper.set(FormFieldRule::getId, formFieldRule.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return getById(formFieldRule.getId());
        } else {
            return formFieldRule;
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