package com.taixin.wxminiprogram.commons;

import org.springframework.web.multipart.MultipartFile;

import java.util.Hashtable;
import java.util.Map;
import java.util.Timer;

public class FileUtil {
    /**
     * String openid
     * MultipartFile[]
     */
    private static Map<String,MultipartFile[]> fileMap=new Hashtable<>();

    /**
     * 添加
     * @param openid
     * @param files
     */
    public static void add(String openid,MultipartFile[] files){
        fileMap.put(openid,files);
        //计时5分钟删除openid
        Timer timer=new Timer();
        timer.schedule(new FileUtilThread(),1*300000);
    }

    /**
     * 查询文件
     * @param openid
     * @return
     */
    public static MultipartFile[] getByOpenid(String openid){
        return fileMap.get(openid);
    }

    public static void delete(String openid){
        fileMap.remove(openid);
    }
}
