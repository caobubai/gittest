package com.pojo;

import lombok.Data;

@Data
public class Utterance {
    private String query;
    private String medicalRecord;
    private String sessionId;
    private String officeId;
}
