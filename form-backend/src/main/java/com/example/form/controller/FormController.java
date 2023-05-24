package com.example.form.controller;

import com.example.form.entity.Form;
import com.example.form.service.FormService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 表单;(form)表控制层
 *
 * @author : http://www.chiner.pro
 * @date : 2023-5-16
 */
@Api(tags = "表单对象功能接口")
@RestController
@RequestMapping("/form")
public class FormController {
    @Autowired
    private FormService formService;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @ApiOperation("通过ID查询单条数据")
    @GetMapping("{id}")
    public ResponseEntity<Form> queryById(Integer id) {
        return ResponseEntity.ok(formService.queryById(id));
    }

    /**
     * 分页查询
     *
     * @param form        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @ApiOperation("分页查询")
    @GetMapping
    public ResponseEntity<PageImpl<Form>> paginQuery(Form form, PageRequest pageRequest) {
        //1.分页参数
        long current = pageRequest.getPageNumber();
        long size = pageRequest.getPageSize();
        //2.分页查询
        /*把Mybatis的分页对象做封装转换，MP的分页对象上有一些SQL敏感信息，还是通过spring的分页模型来封装数据吧*/
        com.baomidou.mybatisplus.extension.plugins.pagination.Page<Form> pageResult = formService.paginQuery(form, current, size);
        //3. 分页结果组装
        List<Form> dataList = pageResult.getRecords();
        long total = pageResult.getTotal();
        PageImpl<Form> retPage = new PageImpl<Form>(dataList, pageRequest, total);
        return ResponseEntity.ok(retPage);
    }

    /**
     * 新增数据
     *
     * @param form 实例对象
     * @return 实例对象
     */
    @ApiOperation("新增数据")
    @PostMapping
    public ResponseEntity<Form> add(Form form) {
        return ResponseEntity.ok(formService.insert(form));
    }

    /**
     * 更新数据
     *
     * @param form 实例对象
     * @return 实例对象
     */
    @ApiOperation("更新数据")
    @PutMapping
    public ResponseEntity<Form> edit(Form form) {
        return ResponseEntity.ok(formService.update(form));
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @ApiOperation("通过主键删除数据")
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(formService.deleteById(id));
    }

    @ApiOperation("修改表单状态")
    @PutMapping("status")
    public ResponseEntity<Form> changeFormStatus(Form form) {
        return ResponseEntity.ok(formService.changeFormStatus(form.getId(), form.getStatus()));
    }
}