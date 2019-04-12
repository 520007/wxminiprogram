package com.taixin.wxminiprogram.service;

import org.springframework.web.multipart.MultipartFile;

public interface ToPrayService {
    public void toPray(String openid,MultipartFile[] files,double total);
}
