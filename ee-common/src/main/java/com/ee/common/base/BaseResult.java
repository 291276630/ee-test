package com.ee.common.base;

/**
 * @Description 统一返回结果
 * @Author Shane
 * @Date 2019/3/31 13:26
 */
public class BaseResult {

    public static final int SUCCESS_CODE = 0;
    public static final int EXPIRE_CODE = -1;
    public static final int FAILURE_CODE = 1;
    public static final int ILLEGAL_CODE = 400;
    public static final int FORBIDDEN_CODE = 403;

    public static final String SUCCESS_MSG = "请求成功";
    public static final String EXPIRE_MSG = "token失效";
    public static final String FAILURE_MSG = "请求失败";
    public static final String ILLEGAL_MSG = "参数异常";
    public static final String FORBIDDEN_MSG = "权限不足";

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

    /**
     * 请求成功
     * @param data
     * @return
     */
    public static BaseResult returnSuccess(Object data){
        return new BaseResult(SUCCESS_CODE, SUCCESS_MSG, data);
    }

    /**
     * token过期
     * @return
     */
    public static BaseResult resultExpire(){
        return new BaseResult(EXPIRE_CODE, EXPIRE_MSG, null);
    }

    /**
     * 请求失败
     * @return
     */
    public static BaseResult returnFailure(){
        return new BaseResult(FAILURE_CODE, FAILURE_MSG, null);
    }

    /**
     * 请求失败，自定义失败信息
     * @param msg
     * @param data
     * @return
     */
    public static BaseResult returnFailure(String msg, Object data){
        return new BaseResult(FAILURE_CODE, msg, data);
    }

    /**
     * 参数异常
     * @return
     */
    public static BaseResult returnIllegal(){
        return new BaseResult(ILLEGAL_CODE, ILLEGAL_MSG, null);
    }

    /**
     * 权限不足
     * @return
     */
    public static BaseResult returnForbidden(){
        return new BaseResult(FORBIDDEN_CODE, FORBIDDEN_MSG, null);
    }

    /**
     * 返回结果
     * @param code
     * @param msg
     * @param data
     */
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
