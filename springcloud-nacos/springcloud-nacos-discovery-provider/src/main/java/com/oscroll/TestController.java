package com.oscroll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test/{string}")
    public String test(@PathVariable String string) {
        return "Hello Nacos :" + string;
    }
}