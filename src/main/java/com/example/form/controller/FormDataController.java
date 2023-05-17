package com.example.form.controller;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.form.entity.FormData;
import com.example.form.service.FormDataService;

 /**
 * 表单数据;(form_data)表控制层
 * @author : http://www.chiner.pro
 * @date : 2023-5-16
 */
@Api(tags = "表单数据对象功能接口")
@RestController
@RequestMapping("/formData")
public class FormDataController{
    @Autowired
    private FormDataService formDataService;
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    @ApiOperation("通过ID查询单条数据")
    @GetMapping("{id}")
    public ResponseEntity<FormData> queryById(Integer id){
        return ResponseEntity.ok(formDataService.queryById(id));
    }
    
    /** 
     * 分页查询
     *
     * @param formData 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @ApiOperation("分页查询")
    @GetMapping
    public ResponseEntity<PageImpl<FormData>> paginQuery(FormData formData, PageRequest pageRequest){
        //1.分页参数
        long current = pageRequest.getPageNumber();
        long size = pageRequest.getPageSize();
        //2.分页查询
        /*把Mybatis的分页对象做封装转换，MP的分页对象上有一些SQL敏感信息，还是通过spring的分页模型来封装数据吧*/
        com.baomidou.mybatisplus.extension.plugins.pagination.Page<FormData> pageResult = formDataService.paginQuery(formData, current,size);
        //3. 分页结果组装
        List<FormData> dataList = pageResult.getRecords();
        long total = pageResult.getTotal();
        PageImpl<FormData> retPage = new PageImpl<FormData>(dataList,pageRequest,total);
        return ResponseEntity.ok(retPage);
    }
    
    /** 
     * 新增数据
     *
     * @param formData 实例对象
     * @return 实例对象
     */
    @ApiOperation("新增数据")
    @PostMapping
    public ResponseEntity<FormData> add(FormData formData){
        return ResponseEntity.ok(formDataService.insert(formData));
    }

     /**
      * 新增数据
      *
      * @param formData 实例对象
      * @return 实例对象
      */
     @ApiOperation("批量新增数据")
     @PostMapping("batch")
     public ResponseEntity<FormData> batchAdd(List<FormData> formData){
         return ResponseEntity.ok(formDataService.batchInsert(formData));
     }
    
    /** 
     * 更新数据
     *
     * @param formData 实例对象
     * @return 实例对象
     */
    @ApiOperation("更新数据")
    @PutMapping
    public ResponseEntity<FormData> edit(FormData formData){
        return ResponseEntity.ok(formDataService.update(formData));
    }
    
    /** 
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @ApiOperation("通过主键删除数据")
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id){
        return ResponseEntity.ok(formDataService.deleteById(id));
    }
}