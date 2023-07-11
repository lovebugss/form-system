package com.example.form.service.form.parser;

import com.example.form.pojo.dto.CreateFormDTO;
import org.springframework.stereotype.Service;

/**
 * avue 表单解析器
 * 详细文档: <a href="https://form.avuejs.com/">avue</a>
 */
@Service
public class AvueSchemeParser implements FormDesignerSchemeParser {
    /**
     * @param scheme 表单scheme
     * @return
     */
    @Override
    public CreateFormDTO parse(String scheme) {
        // {column:[{title:'分割线',component:'el-divider',span:24,tips:'看我：自定义属性怎么用？',labelWidth:'0px',params:{html:'<h3 style=\"color:red\">分割线标题</h3>',contentPosition:'left'},prop:'a168907782870013923'},{title:'警告',component:'el-alert',labelWidth:'0px',span:24,tips:'看我：自定义事件怎么用？',params:{title:'警告警告警告警告',type:'success'},event:{close:() => {
        //    console.log('alert关闭事件')
        //  }},prop:'a168907783064475295'},{type:'dynamic',label:'子表单',span:24,display:true,children:{align:'center',headerAlign:'center',index:false,addBtn:true,delBtn:true,column:[]},prop:'a168907783546790949'},{type:'input',label:'单行文本',span:24,display:true,prop:'a168907783593240223'},{type:'password',label:'密码',span:24,display:true,prop:'a168907783637936388'},{type:'textarea',label:'多行文本',span:24,display:true,prop:'a168907783685273873'},{type:'number',label:'计数器',controls:true,span:24,display:true,prop:'a168907783721237397'},{type:'url',label:'超链接',span:24,display:true,prop:'a16890778376286443'},{type:'array',label:'数组',span:24,display:true,prop:'a168907783795599770'},{type:'img',label:'图片',span:24,display:true,prop:'a16890778386209880'},{type:'map',component:'avue-input-map',label:'地图选择器',span:24,display:true,prop:'a168907783898093994'}],labelPosition:'left',labelSuffix:'：',labelWidth:120,gutter:0,menuBtn:true,submitBtn:true,submitText:'提交',emptyBtn:true,emptyText:'清空',menuPosition:'center',group:[{label:'分组',prop:'a168907783195589282',arrow:false,collapse:true,display:true,column:[]}]}
        return null;
    }

    @Override
    public FormSchemeType schemeType() {
        return FormSchemeType.AVUE;
    }
}
