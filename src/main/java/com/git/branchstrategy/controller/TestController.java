package com.git.branchstrategy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/v1")
    public ResponseEntity<String> getTest(){
        return ResponseEntity.ok().body("feature/#1234 기능 구현 완료");
    }
}
