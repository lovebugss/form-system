package com.example.form.controller;

import com.example.form.entity.FormItem;
import com.example.form.service.FormItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 表单项;(form_item)表控制层
 *
 * @author : http://www.chiner.pro
 * @date : 2023-5-16
 */
@Api(tags = "表单项对象功能接口")
@RestController
@RequestMapping("/formItem")
public class FormItemController {
    @Autowired
    private FormItemService formItemService;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @ApiOperation("通过ID查询单条数据")
    @GetMapping("{id}")
    public ResponseEntity<FormItem> queryById(Integer id) {
        return ResponseEntity.ok(formItemService.queryById(id));
    }

    /**
     * 分页查询
     *
     * @param formItem    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @ApiOperation("分页查询")
    @GetMapping
    public ResponseEntity<PageImpl<FormItem>> paginQuery(FormItem formItem, PageRequest pageRequest) {
        //1.分页参数
        long current = pageRequest.getPageNumber();
        long size = pageRequest.getPageSize();
        //2.分页查询
        /*把Mybatis的分页对象做封装转换，MP的分页对象上有一些SQL敏感信息，还是通过spring的分页模型来封装数据吧*/
        com.baomidou.mybatisplus.extension.plugins.pagination.Page<FormItem> pageResult = formItemService.paginQuery(formItem, current, size);
        //3. 分页结果组装
        List<FormItem> dataList = pageResult.getRecords();
        long total = pageResult.getTotal();
        PageImpl<FormItem> retPage = new PageImpl<FormItem>(dataList, pageRequest, total);
        return ResponseEntity.ok(retPage);
    }

    /**
     * 新增数据
     *
     * @param formItem 实例对象
     * @return 实例对象
     */
    @ApiOperation("新增数据")
    @PostMapping
    public ResponseEntity<FormItem> add(FormItem formItem) {
        return ResponseEntity.ok(formItemService.insert(formItem));
    }

    /**
     * 更新数据
     *
     * @param formItem 实例对象
     * @return 实例对象
     */
    @ApiOperation("更新数据")
    @PutMapping
    public ResponseEntity<FormItem> edit(FormItem formItem) {
        return ResponseEntity.ok(formItemService.update(formItem));
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @ApiOperation("通过主键删除数据")
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(formItemService.deleteById(id));
    }
}