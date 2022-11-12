package com.codestates;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    // Gitflow 테스트
    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application!";
    }
}
