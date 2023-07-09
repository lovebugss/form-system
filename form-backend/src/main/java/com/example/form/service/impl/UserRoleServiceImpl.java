package com.example.form.service.impl;

import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.example.form.entity.UserRole;
import com.example.form.mapper.UserRoleMapper;
import com.example.form.service.UserRoleService;
 /**
 * 用户角色映射;(user_role)表服务实现类
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@Service
public class UserRoleServiceImpl implements UserRoleService{
    @Autowired
    private UserRoleMapper userRoleMapper;
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    public UserRole queryById(Integer id){
        return userRoleMapper.selectById(id);
    }
    
    /**
     * 分页查询
     *
     * @param userRole 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    public Page<UserRole> paginQuery(UserRole userRole, long current, long size){
        //1. 构建动态查询条件
        LambdaQueryWrapper<UserRole> queryWrapper = new LambdaQueryWrapper<>();
        if(StrUtil.isNotBlank(userRole.getRoleId())){
            queryWrapper.eq(UserRole::getRoleId, userRole.getRoleId());
        }
        //2. 执行分页查询
        Page<UserRole> pagin = new Page<>(current , size , true);
        IPage<UserRole> selectResult = userRoleMapper.selectByPage(pagin , queryWrapper);
        pagin.setPages(selectResult.getPages());
        pagin.setTotal(selectResult.getTotal());
        pagin.setRecords(selectResult.getRecords());
        //3. 返回结果
        return pagin;
    }
    
    /** 
     * 新增数据
     *
     * @param userRole 实例对象
     * @return 实例对象
     */
    public UserRole insert(UserRole userRole){
        userRoleMapper.insert(userRole);
        return userRole;
    }
    
    /** 
     * 更新数据
     *
     * @param userRole 实例对象
     * @return 实例对象
     */
    public UserRole update(UserRole userRole){
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<UserRole> chainWrapper = new LambdaUpdateChainWrapper<UserRole>(userRoleMapper);
        if(StrUtil.isNotBlank(userRole.getRoleId())){
            chainWrapper.eq(UserRole::getRoleId, userRole.getRoleId());
        }
        //2. 设置主键，并更新
        chainWrapper.set(UserRole::getId, userRole.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if(ret){
            return queryById(userRole.getId());
        }else{
            return userRole;
        }
    }
    
    /** 
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Integer id){
        int total = userRoleMapper.deleteById(id);
        return total > 0;
    }
}