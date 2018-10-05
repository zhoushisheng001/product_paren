package com.zhuguan.zhou.response;

/**
 * 返回对象
 *
 * @param <T>
 */
public class ResponseData<T> {

    private T data;

    private int code;

    private String msg;

    public T getData() {
        return data;
    }

    public ResponseData<T> setData(T data) {
        this.data = data;
        return this;
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

    public void ok() {
        this.code = 0;
        this.msg = "成功";
    }
}
