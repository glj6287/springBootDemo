package com.winter.common;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {
	
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static <T> Result<T> genSuccessResult() {
        return new Result<T>()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    public static <T> Result<T> genSuccessResult(T data) {
        return new Result<T>()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static <T> Result<T> genFailResult(String message) {
        return new Result<T>()
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }
    
    public static <T> Result<T> genResult(int code,String message) {
       Result<T> result = new Result<T>();
       result.setCode(code);
       result.setMessage(message);
       return result;
    }
}
