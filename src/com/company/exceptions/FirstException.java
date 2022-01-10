package com.company.exceptions;

public class FirstException extends Exception{

    private final static String MESSAGE = "Oh no!";

    public FirstException(){
        super(MESSAGE);
    }

}
