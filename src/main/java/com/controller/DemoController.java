package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("test1")
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("api")
    public ResponseEntity<String> demo(@RequestBody Map<String,Object> map) throws IOException {
        String URL="https://api.aladinai.cn/aladin_ai_medical/company/foreign_doctor/oulanyun_robot";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic aW90OmlvdA==");
        HttpEntity httpEntity = new HttpEntity(map, headers);
        ResponseEntity<String> responseBean= restTemplate.postForEntity(URL, httpEntity, String.class);

        return responseBean;
    }
}
