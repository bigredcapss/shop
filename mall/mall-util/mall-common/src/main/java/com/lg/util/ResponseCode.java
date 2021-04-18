package com.lg.util;

/**
 * 响应状态码的枚举对象
 * @author BigRedCaps
 * @date 2021/4/18 14:54
 */
public enum ResponseCode
{
    SUCCESS(20000, "操作成功"),
    ERROR(50000, "操作失败"),
    SYSTEM_ERROR(50001, "系统错误");

    private Integer code;
    private String message;

    ResponseCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    ResponseCode() {
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
