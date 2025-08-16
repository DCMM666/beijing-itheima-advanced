package com.itheima.demo1exception;

public class AgeOutOfBoundsException extends Exception{
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
