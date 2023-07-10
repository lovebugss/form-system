package com.example.form.controller;

import com.example.form.entity.User;
import com.example.form.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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