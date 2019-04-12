package com.taixin.wxminiprogram.controller;

import com.taixin.wxminiprogram.pojo.Pay;
import com.taixin.wxminiprogram.pojo.vo.Result;
import com.taixin.wxminiprogram.service.PayService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PayController {
    @Autowired
    private PayService payService;

    @RequestMapping("/getByName")
    public Result getByName(String name) throws Exception {
        Result result=new Result();
        if(StringUtils.isBlank(name)){
            result.setState(500).setMsg("请输入要查询单价商品名字");
        }
        Pay pay=payService.getByName(name);
        if(pay!=null){
            result.setData(pay);
        }
        return result;
    }
}
