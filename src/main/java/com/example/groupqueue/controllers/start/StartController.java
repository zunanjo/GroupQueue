package com.example.groupqueue.controllers.start;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {
    @GetMapping("/")
    public String start() {
        return "/views/startPage/startPageDesktop";
    }
}
