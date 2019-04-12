package com.taixin.wxminiprogram.service;

import com.taixin.wxminiprogram.pojo.Pay;

public interface PayService {
    /**
     * 根据名字返回信息
     * @param name
     * @return
     * @throws Exception
     */
    public Pay getByName(String name) throws Exception;
}
