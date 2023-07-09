package com.example.form.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.form.entity.UserRole;

 /**
 * 用户角色映射;(user_role)表服务接口
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
public interface UserRoleService{
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    UserRole queryById(Integer id);
    
    /**
     * 分页查询
     *
     * @param userRole 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    Page<UserRole> paginQuery(UserRole userRole, long current, long size);
    /** 
     * 新增数据
     *
     * @param userRole 实例对象
     * @return 实例对象
     */
    UserRole insert(UserRole userRole);
    /** 
     * 更新数据
     *
     * @param userRole 实例对象
     * @return 实例对象
     */
    UserRole update(UserRole userRole);
    /** 
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
}