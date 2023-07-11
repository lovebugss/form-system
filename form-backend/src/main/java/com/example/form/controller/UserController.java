package com.example.form.controller;

import com.example.form.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * 用户;(user)表控制层
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@Api(tags = "用户对象功能接口")
@RestController
@RequestMapping("/user")
public class UserController{
    private final UserService userService;

     public UserController(UserService userService) {
         this.userService = userService;
     }

}