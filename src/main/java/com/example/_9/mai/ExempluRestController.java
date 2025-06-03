package com.example._9.mai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExempluRestController {


    @GetMapping("/test")
    public String text() {
        return "Sandu Guzun";
    }
}
