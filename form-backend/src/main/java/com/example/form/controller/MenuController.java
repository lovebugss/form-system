package com.example.form.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import com.example.form.service.MenuService;

 /**
 * 菜单;(menu)表控制层
 * @author : http://www.chiner.pro
 * @date : 2023-5-30
 */
@Api(tags = "菜单对象功能接口")
@RestController
@RequestMapping("/menu")
public class MenuController{
    private final MenuService menuService;

     public MenuController(MenuService menuService) {
         this.menuService = menuService;
     }

}