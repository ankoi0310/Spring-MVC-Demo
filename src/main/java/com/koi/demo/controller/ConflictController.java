package com.koi.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/conflict")
public class ConflictController {

    @RequestMapping("/hello")
    public String displayForm() {
        return "conflict";
    }
}
