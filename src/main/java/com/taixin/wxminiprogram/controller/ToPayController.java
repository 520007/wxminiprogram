package com.taixin.wxminiprogram.controller;

import com.taixin.wxminiprogram.commons.ZxingUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/topay")
public class ToPayController {
    /**
     * 二维码生成
     * @param contents  内容
     * @param width 长度
     * @param response
     * @throws IOException
     */
    @RequestMapping("/zxing")
    public void zxing(String contents, int width, HttpServletResponse response) throws IOException {
        ZxingUtils.getQRCodeImge(contents,width,width,response.getOutputStream());
    }

    /**
     * 提供文件回调支付二维码
     * @param openid
     * @param files
     */
    public void toPray(String openid,MultipartFile[] files,double total){

    }

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
