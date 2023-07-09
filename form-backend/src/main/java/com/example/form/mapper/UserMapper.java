package com.example.form.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.example.form.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

 /**
 * 用户;(user)表数据库访问层
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@Mapper
public interface UserMapper  extends BaseMapper<User>{
    /** 
     * 分页查询指定行数据
     *
     * @param page 分页参数
     * @param wrapper 动态查询条件
     * @return 分页对象列表
     */
    IPage<User> selectByPage(IPage<User> page , @Param(Constants.WRAPPER) Wrapper<User> wrapper);
}