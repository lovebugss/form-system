package com.example.form.service.impl;

import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.example.form.entity.Role;
import com.example.form.mapper.RoleMapper;
import com.example.form.service.RoleService;
 /**
 * 角色;(role)表服务实现类
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleMapper roleMapper;
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    public Role queryById(Integer id){
        return roleMapper.selectById(id);
    }
    
    /**
     * 分页查询
     *
     * @param role 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    public Page<Role> paginQuery(Role role, long current, long size){
        //1. 构建动态查询条件
        LambdaQueryWrapper<Role> queryWrapper = new LambdaQueryWrapper<>();
        if(StrUtil.isNotBlank(role.getName())){
            queryWrapper.eq(Role::getName, role.getName());
        }
        //2. 执行分页查询
        Page<Role> pagin = new Page<>(current , size , true);
        IPage<Role> selectResult = roleMapper.selectByPage(pagin , queryWrapper);
        pagin.setPages(selectResult.getPages());
        pagin.setTotal(selectResult.getTotal());
        pagin.setRecords(selectResult.getRecords());
        //3. 返回结果
        return pagin;
    }
    
    /** 
     * 新增数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    public Role insert(Role role){
        roleMapper.insert(role);
        return role;
    }
    
    /** 
     * 更新数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    public Role update(Role role){
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<Role> chainWrapper = new LambdaUpdateChainWrapper<Role>(roleMapper);
        if(StrUtil.isNotBlank(role.getName())){
            chainWrapper.eq(Role::getName, role.getName());
        }
        //2. 设置主键，并更新
        chainWrapper.set(Role::getId, role.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if(ret){
            return queryById(role.getId());
        }else{
            return role;
        }
    }
    
    /** 
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Integer id){
        int total = roleMapper.deleteById(id);
        return total > 0;
    }
}