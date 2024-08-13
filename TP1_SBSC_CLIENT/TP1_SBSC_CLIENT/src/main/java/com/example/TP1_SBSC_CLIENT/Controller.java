package com.example.TP1_SBSC_CLIENT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/ola")
    public String sayHello() {
        return "Ola!";
    }
}
