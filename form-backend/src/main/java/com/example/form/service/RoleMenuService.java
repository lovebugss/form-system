package com.example.form.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.form.entity.RoleMenu;

 /**
 * 角色菜单映射;(role_menu)表服务接口
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
public interface RoleMenuService{
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    RoleMenu queryById(Integer id);
    
    /**
     * 分页查询
     *
     * @param roleMenu 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    Page<RoleMenu> paginQuery(RoleMenu roleMenu, long current, long size);
    /** 
     * 新增数据
     *
     * @param roleMenu 实例对象
     * @return 实例对象
     */
    RoleMenu insert(RoleMenu roleMenu);
    /** 
     * 更新数据
     *
     * @param roleMenu 实例对象
     * @return 实例对象
     */
    RoleMenu update(RoleMenu roleMenu);
    /** 
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
}