package com.example.form.service.impl;

import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.example.form.entity.RoleMenu;
import com.example.form.mapper.RoleMenuMapper;
import com.example.form.service.RoleMenuService;
 /**
 * 角色菜单映射;(role_menu)表服务实现类
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@Service
public class RoleMenuServiceImpl implements RoleMenuService{
    @Autowired
    private RoleMenuMapper roleMenuMapper;
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    public RoleMenu queryById(Integer id){
        return roleMenuMapper.selectById(id);
    }
    
    /**
     * 分页查询
     *
     * @param roleMenu 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    public Page<RoleMenu> paginQuery(RoleMenu roleMenu, long current, long size){
        //1. 构建动态查询条件
        LambdaQueryWrapper<RoleMenu> queryWrapper = new LambdaQueryWrapper<>();
        if(StrUtil.isNotBlank(roleMenu.getMenuId())){
            queryWrapper.eq(RoleMenu::getMenuId, roleMenu.getMenuId());
        }
        //2. 执行分页查询
        Page<RoleMenu> pagin = new Page<>(current , size , true);
        IPage<RoleMenu> selectResult = roleMenuMapper.selectByPage(pagin , queryWrapper);
        pagin.setPages(selectResult.getPages());
        pagin.setTotal(selectResult.getTotal());
        pagin.setRecords(selectResult.getRecords());
        //3. 返回结果
        return pagin;
    }
    
    /** 
     * 新增数据
     *
     * @param roleMenu 实例对象
     * @return 实例对象
     */
    public RoleMenu insert(RoleMenu roleMenu){
        roleMenuMapper.insert(roleMenu);
        return roleMenu;
    }
    
    /** 
     * 更新数据
     *
     * @param roleMenu 实例对象
     * @return 实例对象
     */
    public RoleMenu update(RoleMenu roleMenu){
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<RoleMenu> chainWrapper = new LambdaUpdateChainWrapper<RoleMenu>(roleMenuMapper);
        if(StrUtil.isNotBlank(roleMenu.getMenuId())){
            chainWrapper.eq(RoleMenu::getMenuId, roleMenu.getMenuId());
        }
        //2. 设置主键，并更新
        chainWrapper.set(RoleMenu::getId, roleMenu.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if(ret){
            return queryById(roleMenu.getId());
        }else{
            return roleMenu;
        }
    }
    
    /** 
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Integer id){
        int total = roleMenuMapper.deleteById(id);
        return total > 0;
    }
}