package com.layfolk.chat.utils;

import lombok.Data;

@Data
public class ResultUtil {

    private String code;    // 200 表示正常, 非 200 表示异常
    private String msg;
    private Object data;

    public static ResultUtil succ(Object data) {
        return succ("200", "操作成功", data);
    }

    public static ResultUtil succ(String code, String msg, Object data) {
        ResultUtil r = new ResultUtil();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static ResultUtil fail(String msg) {
        return fail("400", msg, null);
    }

    public static ResultUtil fail(String msg, Object data) {
        return fail("400", msg, data);
    }

    public static ResultUtil fail(String code, String msg, Object data) {
        ResultUtil r = new ResultUtil();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
