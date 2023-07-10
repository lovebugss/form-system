package com.example.form.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.form.entity.Role;
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