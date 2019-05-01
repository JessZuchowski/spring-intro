package com.lab11java401d3.songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IntroController {

    @GetMapping("/test")
    @ResponseBody
    public String getTest() {
        return "Testing, testing.";
    }

        @GetMapping("/hello")
        @ResponseBody
    public String getHello() {
        return "Hello!";
    }

    @GetMapping("/capitalize/{string}")
    @ResponseBody
    public String getCapitalize(@PathVariable String string) {

            String capital = string;
            return string.toUpperCase();
    }

 }


