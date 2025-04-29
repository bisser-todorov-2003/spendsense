package com.finance.expenseservice.Controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping
    public String sayHello() {
        return "Hello!";
    }

}