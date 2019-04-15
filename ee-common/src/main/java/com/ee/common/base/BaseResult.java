package com.ee.common.base;

/**
 * @Description 统一返回结果
 * @Author Shane
 * @Date 2019/3/31 13:26
 */
public class BaseResult {
    /**
     * 状态码，0表示成功，其他表示失败
     */
    public int code;

    /**
     * 描述信息，成功返回success，其他返回失败原因
     */
    public String msg;

    /**
     * 数据结果集
     */
    public Object data;

    public BaseResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
