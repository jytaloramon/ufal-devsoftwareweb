package com.disteoe.disteoeservice.exceptiondisteoe;

public class ExceptionItemOrder extends Exception {

    public ExceptionItemOrder(String msg) {
        super(msg);
    }

    public ExceptionItemOrder(String msg, Throwable throwable) {
        super(msg, throwable);
    }

}
