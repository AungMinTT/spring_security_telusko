package com.spring.security_example;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("")
    public String getHello(HttpServletRequest request){
        return "Hello World!" +  request.getSession().getId();
    }
}
