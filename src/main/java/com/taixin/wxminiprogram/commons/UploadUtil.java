package com.taixin.wxminiprogram.commons;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UploadUtil {
    private static Log logger = LogFactory.getLog(UploadUtil.class);
    /**
     * pc图片保存
     *
     * @param files
     *            文件
     * @param request
     *            请求对象
     * @param paSrc
     *            保存文件夹路径
     * @return
     * @throws Exception
     */
    protected static List saveHomeImg(MultipartFile[] files, HttpServletRequest request, String paSrc) {
        List<String> srcList=new ArrayList<>();
        for(int i =0;i<files.length;i++){
            String fileName = files[i].getOriginalFilename();
            if (fileName.equals("")) {
                return null;
            }
            fileName = UUID.randomUUID().toString().replace("-","");// 文件名设置
            String diskDir = request.getServletContext().getRealPath("/" + paSrc); // 磁盘路

            File tempDir = new File(diskDir);// 获取文件夹
            if (!tempDir.exists())
                tempDir.mkdirs();// 文件夹不存在创建
            String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
                    + request.getContextPath() + "/";
            String src = (String) basePath + paSrc.substring(8, paSrc.length()) + fileName;// 图片访问路径
            File file = new File(diskDir + fileName);// 获取文件
            try {
                files[i].transferTo(file);// 保存文件
            } catch (Exception e) {
                logger.info("文件保存失败");
                e.printStackTrace();
                return null;
            }
            srcList.add(src);
        }
         // 保存文件
        return srcList;
    }
}
