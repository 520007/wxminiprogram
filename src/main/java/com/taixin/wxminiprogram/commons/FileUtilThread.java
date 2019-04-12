package com.taixin.wxminiprogram.commons;

import java.util.TimerTask;

public class FileUtilThread extends TimerTask {
    private String openid;

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Override
    public void run() {
        FileUtil.delete(openid);
    }
}
