package kz.aitu.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class EmployeeController {
    @GetMapping("employees")
    public String sayHello(){
        return "Hello World!";
    }
}
