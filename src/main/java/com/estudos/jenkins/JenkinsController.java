package com.estudos.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping
    public String get() {
        return "Eae, tranquilo?";
    }
}
