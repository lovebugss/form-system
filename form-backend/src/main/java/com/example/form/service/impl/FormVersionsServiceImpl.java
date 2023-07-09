package com.example.form.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.form.entity.FormVersions;
import com.example.form.mapper.FormVersionsMapper;
import com.example.form.service.FormVersionsService;
import org.springframework.stereotype.Service;

/**
 * 表单版本;(form_versions)表服务实现类
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Service
public class FormVersionsServiceImpl extends ServiceImpl<FormVersionsMapper, FormVersions> implements FormVersionsService {

    /**
     * 分页查询
     *
     * @param formVersions 筛选条件
     * @param current      当前页码
     * @param size         每页大小
     * @return
     */
    @Override
    public Page<FormVersions> paginQuery(FormVersions formVersions, long current, long size) {
        //1. 构建动态查询条件
        LambdaQueryWrapper<FormVersions> queryWrapper = new LambdaQueryWrapper<>();
        if (StrUtil.isNotBlank(formVersions.getFormId())) {
            queryWrapper.eq(FormVersions::getFormId, formVersions.getFormId());
        }
        //2. 执行分页查询
        Page<FormVersions> pagin = new Page<>(current, size, true);
        IPage<FormVersions> selectResult = this.baseMapper.selectByPage(pagin, queryWrapper);
        pagin.setPages(selectResult.getPages());
        pagin.setTotal(selectResult.getTotal());
        pagin.setRecords(selectResult.getRecords());
        //3. 返回结果
        return pagin;
    }

    /**
     * 新增数据
     *
     * @param formVersions 实例对象
     * @return 实例对象
     */
    @Override
    public FormVersions insert(FormVersions formVersions) {
        this.baseMapper.insert(formVersions);
        return formVersions;
    }

    /**
     * 更新数据
     *
     * @param formVersions 实例对象
     * @return 实例对象
     */
    @Override
    public FormVersions update(FormVersions formVersions) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<FormVersions> chainWrapper = new LambdaUpdateChainWrapper<FormVersions>(this.baseMapper);
        if (StrUtil.isNotBlank(formVersions.getFormId())) {
            chainWrapper.eq(FormVersions::getFormId, formVersions.getFormId());
        }
        //2. 设置主键，并更新
        chainWrapper.set(FormVersions::getId, formVersions.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return getById(formVersions.getId());
        } else {
            return formVersions;
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