package com.koi.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "processForm";
    }

    @RequestMapping("/processFormVer2")
    public String sayHello(@RequestParam("studentName") String name, Model model) {
        // String name = request.getParameter("studentName");
        name = name.toUpperCase();

        String result = "Hello " + name;
        model.addAttribute("message", result);
        return "processForm";
    }
}
