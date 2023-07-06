package com.pojo;

import lombok.Data;

@Data
public class Response {
    private String utterance;
    private String deviceId;
    private String sessionId;
}
