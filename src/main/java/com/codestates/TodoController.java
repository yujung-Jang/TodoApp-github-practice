package com.codestates;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    // Gitflow 테스트 2
    // squash merge 테스트
    // 인텔리제이에서 Git 다루기!
    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application!";
    }
}
