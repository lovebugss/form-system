package com.example.form.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.form.entity.Role;

 /**
 * 角色;(role)表服务接口
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
public interface RoleService{
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    Role queryById(Integer id);
    
    /**
     * 分页查询
     *
     * @param role 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    Page<Role> paginQuery(Role role, long current, long size);
    /** 
     * 新增数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    Role insert(Role role);
    /** 
     * 更新数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    Role update(Role role);
    /** 
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
}