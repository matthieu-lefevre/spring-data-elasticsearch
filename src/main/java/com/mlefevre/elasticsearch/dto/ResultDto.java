package com.mlefevre.elasticsearch.dto;

import com.mlefevre.elasticsearch.enumeration.Status;

public class ResultDto<T> {

    private T data;
    private Status status;
    private String error;


    public ResultDto(T data) {
        this.data = data;
        this.status = Status.SUCCESS;
    }

    public ResultDto(String errorMessage) {
        this.error = errorMessage;
        this.status = Status.FAILURE;
    }


}
