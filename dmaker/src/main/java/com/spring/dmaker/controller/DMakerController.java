package com.spring.dmaker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
public class DMakerController {
    @GetMapping("/developers")
    public List<String> getAllDevelopers() {
//        GET /developers HTTP/1.1 이라고 요청이 들어오면
        log.info("GET /developers HTTP/1.1"); // 로그 남기기
        return Arrays.asList("snow", "Elsa", "Olaf");
    }
}
