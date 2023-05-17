package com.example.form.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.example.form.entity.Form;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 表单;(form)表数据库访问层
 * @author : http://www.chiner.pro
 * @date : 2023-5-16
 */
@Mapper
public interface FormMapper  extends BaseMapper<Form>{
    /** 
     * 分页查询指定行数据
     *
     * @param page 分页参数
     * @param wrapper 动态查询条件
     * @return 分页对象列表
     */
    IPage<Form> selectByPage(IPage<Form> page , @Param(Constants.WRAPPER) Wrapper<Form> wrapper);
}