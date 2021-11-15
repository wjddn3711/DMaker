package com.spring.dmaker.controller;

import com.spring.dmaker.service.DMakerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DMakerController {
    // 서비스 빈을 주입
    private final DMakerService dMakerService;

    @GetMapping("/developers")
    public List<String> getAllDevelopers() {
//        GET /developers HTTP/1.1 이라고 요청이 들어오면
        log.info("GET /developers HTTP/1.1"); // 로그 남기기
        return Arrays.asList("snow", "Elsa", "Olaf");
    }

    @GetMapping("/create-developers")
    public List<String> createDevelopers() {
//        GET /developers HTTP/1.1 이라고 요청이 들어오면
        log.info("GET /create-developers HTTP/1.1");
        dMakerService.createDeveloper();
        return Collections.singletonList("Olaf"); // 단일객체를 들고있는 리스트를 만들때는 싱글톤을 사용하는 것이 좋다
    }
}
