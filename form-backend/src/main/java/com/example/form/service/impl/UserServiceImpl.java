package com.example.form.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.form.entity.User;
import com.example.form.mapper.UserMapper;
import com.example.form.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 /**
 * 用户;(user)表服务实现类
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    public User queryById(Integer id){
        return userMapper.selectById(id);
    }
    
    /**
     * 分页查询
     *
     * @param user 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    public Page<User> paginQuery(User user, long current, long size){
        //1. 构建动态查询条件
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        if(StrUtil.isNotBlank(user.getUsername())){
            queryWrapper.eq(User::getUsername, user.getUsername());
        }
        if(StrUtil.isNotBlank(user.getPassword())){
            queryWrapper.eq(User::getPassword, user.getPassword());
        }
        if(StrUtil.isNotBlank(user.getDisabled())){
            queryWrapper.eq(User::getDisabled, user.getDisabled());
        }
        //2. 执行分页查询
        Page<User> pagin = new Page<>(current , size , true);
        IPage<User> selectResult = userMapper.selectByPage(pagin , queryWrapper);
        pagin.setPages(selectResult.getPages());
        pagin.setTotal(selectResult.getTotal());
        pagin.setRecords(selectResult.getRecords());
        //3. 返回结果
        return pagin;
    }
    
    /** 
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    public User insert(User user){
        userMapper.insert(user);
        return user;
    }
    
    /** 
     * 更新数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    public User update(User user){
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<User> chainWrapper = new LambdaUpdateChainWrapper<User>(userMapper);
        if(StrUtil.isNotBlank(user.getUsername())){
            chainWrapper.eq(User::getUsername, user.getUsername());
        }
        if(StrUtil.isNotBlank(user.getPassword())){
            chainWrapper.eq(User::getPassword, user.getPassword());
        }
        if(StrUtil.isNotBlank(user.getDisabled())){
            chainWrapper.eq(User::getDisabled, user.getDisabled());
        }
        //2. 设置主键，并更新
        chainWrapper.set(User::getId, user.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if(ret){
            return queryById(user.getId());
        }else{
            return user;
        }
    }
    
    /** 
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Integer id){
        int total = userMapper.deleteById(id);
        return total > 0;
    }
}