package com.example.form.service.impl;

import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.example.form.entity.Menu;
import com.example.form.mapper.MenuMapper;
import com.example.form.service.MenuService;
 /**
 * 菜单;(menu)表服务实现类
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    private MenuMapper menuMapper;
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    public Menu queryById(Integer id){
        return menuMapper.selectById(id);
    }
    
    /**
     * 分页查询
     *
     * @param menu 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    public Page<Menu> paginQuery(Menu menu, long current, long size){
        //1. 构建动态查询条件
        LambdaQueryWrapper<Menu> queryWrapper = new LambdaQueryWrapper<>();
        if(StrUtil.isNotBlank(menu.getName())){
            queryWrapper.eq(Menu::getName, menu.getName());
        }
        if(StrUtil.isNotBlank(menu.getIcon())){
            queryWrapper.eq(Menu::getIcon, menu.getIcon());
        }
        if(StrUtil.isNotBlank(menu.getPath())){
            queryWrapper.eq(Menu::getPath, menu.getPath());
        }
        if(StrUtil.isNotBlank(menu.getParentId())){
            queryWrapper.eq(Menu::getParentId, menu.getParentId());
        }
        //2. 执行分页查询
        Page<Menu> pagin = new Page<>(current , size , true);
        IPage<Menu> selectResult = menuMapper.selectByPage(pagin , queryWrapper);
        pagin.setPages(selectResult.getPages());
        pagin.setTotal(selectResult.getTotal());
        pagin.setRecords(selectResult.getRecords());
        //3. 返回结果
        return pagin;
    }
    
    /** 
     * 新增数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    public Menu insert(Menu menu){
        menuMapper.insert(menu);
        return menu;
    }
    
    /** 
     * 更新数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    public Menu update(Menu menu){
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<Menu> chainWrapper = new LambdaUpdateChainWrapper<Menu>(menuMapper);
        if(StrUtil.isNotBlank(menu.getName())){
            chainWrapper.eq(Menu::getName, menu.getName());
        }
        if(StrUtil.isNotBlank(menu.getIcon())){
            chainWrapper.eq(Menu::getIcon, menu.getIcon());
        }
        if(StrUtil.isNotBlank(menu.getPath())){
            chainWrapper.eq(Menu::getPath, menu.getPath());
        }
        if(StrUtil.isNotBlank(menu.getParentId())){
            chainWrapper.eq(Menu::getParentId, menu.getParentId());
        }
        //2. 设置主键，并更新
        chainWrapper.set(Menu::getId, menu.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if(ret){
            return queryById(menu.getId());
        }else{
            return menu;
        }
    }
    
    /** 
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Integer id){
        int total = menuMapper.deleteById(id);
        return total > 0;
    }
}