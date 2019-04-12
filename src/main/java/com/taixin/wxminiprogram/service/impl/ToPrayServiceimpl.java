package com.taixin.wxminiprogram.service.impl;

import com.taixin.wxminiprogram.commons.FileUtil;
import com.taixin.wxminiprogram.service.ToPrayService;
import org.springframework.web.multipart.MultipartFile;

public class ToPrayServiceimpl implements ToPrayService {
    @Override
    public void toPray(String openid, MultipartFile[] files,double total) {
        //添加文件到map
        FileUtil.add(openid,files);
    }
}
