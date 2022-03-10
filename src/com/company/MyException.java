package com.company;

public class MyException extends RuntimeException {
    public MyException() {
    }
    public MyException(String a) {
        System.out.println(a);
    }
}
