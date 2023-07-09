package com.example.form.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.form.entity.UserRole;

 /**
 * 用户角色映射;(user_role)表数据库访问层
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@Mapper
public interface UserRoleMapper  extends BaseMapper<UserRole>{
    /** 
     * 分页查询指定行数据
     *
     * @param page 分页参数
     * @param wrapper 动态查询条件
     * @return 分页对象列表
     */
    IPage<UserRole> selectByPage(IPage<UserRole> page , @Param(Constants.WRAPPER) Wrapper<UserRole> wrapper);
}