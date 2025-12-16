package com.example.vistula_java_project_task_1.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HelloControler {

    @GetMapping(value = "/")
    public String index() {
        return "Hello World!";
    }

    @GetMapping(value = "/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
