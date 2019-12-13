package com.meli.morsetranslator.dto;

public class MessageDto {

    private String response;
    private Integer code;

    public MessageDto() {
    }

    public MessageDto(String text) {
        this.code = 200;
        this.response = text;
    }

    public String getResponse() {
        return response;
    }

    public Integer getCode() {
        return code;
    }
}

