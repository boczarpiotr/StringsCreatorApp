package com.boczar.StringsCreatorApp.util;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringsController {


    @GetMapping("/hello")
    public String getHello() {
        return "Hello from Strings App";
    }
}
