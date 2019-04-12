package com.taixin.wxminiprogram.dao;

import com.taixin.wxminiprogram.pojo.Pay;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PayMapper {
    /**
     * 根据名字返回信息
     * @param name
     * @return
     * @throws Exception
     */
    public Pay getByName(String name) throws Exception;
}
