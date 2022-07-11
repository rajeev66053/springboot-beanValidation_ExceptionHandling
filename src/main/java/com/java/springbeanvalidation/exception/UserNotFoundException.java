package com.java.springbeanvalidation.exception;

public class UserNotFoundException  extends Exception{
    public UserNotFoundException(String message) {
        super(message);
    }
}