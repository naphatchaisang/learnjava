package com.example.todolist.model;

public class ErrorBody {

    private int errorCode;
    private String errorDetail;

    public ErrorBody(int errorCode, String errorDetail){
        this.errorCode = errorCode;
        this.errorDetail = errorDetail;
    }

    

}
