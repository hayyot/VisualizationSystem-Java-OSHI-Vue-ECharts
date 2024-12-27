package com.hayyot.oshiapp.common;

import lombok.Data;

/**
 * @className: R
 * @author: Jason Shen
 * @date: 2024/12/27
 **/
@Data
public class R {
    private Integer code;
    private String msg;
    private Object data;
    public R(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }
    public R(Integer code, String msg, Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static R ok(){
        return new R(200,"ok");
    }

    public static R ok(Object data){
        return new R(200,"ok",data);
    }

    public static R error(){
        return new R(500,"error");
    }
    public static R error(Object data){
        return new R(500,"error",data);
    }

    public static R error(Integer code,String msg){
        return new R(code,msg);
    }
}
