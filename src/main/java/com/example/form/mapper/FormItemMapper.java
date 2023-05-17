package com.example.form.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.form.entity.FormItem;

 /**
 * 表单项;(form_item)表数据库访问层
 * @author : http://www.chiner.pro
 * @date : 2023-5-16
 */
@Mapper
public interface FormItemMapper  extends BaseMapper<FormItem>{
    /** 
     * 分页查询指定行数据
     *
     * @param page 分页参数
     * @param wrapper 动态查询条件
     * @return 分页对象列表
     */
    IPage<FormItem> selectByPage(IPage<FormItem> page , @Param(Constants.WRAPPER) Wrapper<FormItem> wrapper);
}