package com.taixin.wxminiprogram.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 前后端交互
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Result implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer code = 0;//代码
    private Long count;//分页总数
    private Integer state = 200;//状态
    private String msg = "请求成功";//信息
    private Object data;//请求结果

    public static Result ok(){
        return ok(null);
    }

    public static Result ok(Object data){
        return new Result().setData(data);
    }

    public static Result error(int state,String msg){
        return new Result().setState(state).setMsg(msg);
    }

}

