package com.example.form.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.form.pojo.entity.Menu;

 /**
 * 菜单;(menu)表服务接口
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
public interface MenuService{
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    Menu queryById(Integer id);
    
    /**
     * 分页查询
     *
     * @param menu 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    Page<Menu> paginQuery(Menu menu, long current, long size);
    /** 
     * 新增数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    Menu insert(Menu menu);
    /** 
     * 更新数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    Menu update(Menu menu);
    /** 
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
}