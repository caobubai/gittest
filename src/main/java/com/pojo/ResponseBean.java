package com.pojo;

import lombok.Data;

@Data
public class ResponseBean {
    private String message;
    private Response response;
    private Boolean shouldEndSession;
    private String statusCode;
    private String type;
}
