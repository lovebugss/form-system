package com.example.form.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.example.form.pojo.entity.FormVersions;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 表单版本;(form_versions)表数据库访问层
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Mapper
public interface FormVersionsMapper extends BaseMapper<FormVersions> {
    /**
     * 分页查询指定行数据
     *
     * @param page    分页参数
     * @param wrapper 动态查询条件
     * @return 分页对象列表
     */
    IPage<FormVersions> selectByPage(IPage<FormVersions> page, @Param(Constants.WRAPPER) Wrapper<FormVersions> wrapper);
}