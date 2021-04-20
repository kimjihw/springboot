package com.school.springboot.controller;

import com.school.springboot.exception.ForbiddenException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
    @GetMapping("/internalerror")
    public void internalerror() {
        throw new RuntimeException("500 Internal Error !!");
    }

    @GetMapping("/forbidden")
    public void forbidden() {
        throw new ForbiddenException("403 Forbidden !!");
    }

}
