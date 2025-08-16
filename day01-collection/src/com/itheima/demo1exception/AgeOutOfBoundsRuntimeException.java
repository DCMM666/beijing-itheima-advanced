package com.itheima.demo1exception;

//自定义运行异常
public class AgeOutOfBoundsRuntimeException extends RuntimeException {
    public AgeOutOfBoundsRuntimeException() {
    }

    public AgeOutOfBoundsRuntimeException(String message) {
        super(message);
    }
}
