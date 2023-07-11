package com.example.form.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import com.example.form.service.RoleService;

/**
 * 角色;(role)表控制层
 *
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@Api(tags = "角色对象功能接口")
@RestController
@RequestMapping("/role")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }
}