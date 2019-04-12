package com.taixin.wxminiprogram.service.impl;

import com.taixin.wxminiprogram.dao.PayMapper;
import com.taixin.wxminiprogram.pojo.Pay;
import com.taixin.wxminiprogram.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServiceimpl implements PayService {
    @Autowired
    private PayMapper payMapper;
    @Override
    public Pay getByName(String name) throws Exception {
        return payMapper.getByName(name);
    }
}
