package kz.aitu.demo.controllers;

<<<<<<< HEAD
import kz.aitu.demo.models.Employee;
import kz.aitu.demo.services.interfaces.EmployeeServiceInterface;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")

public class EmployeeController {

    private final EmployeeServiceInterface service;

    public EmployeeController(EmployeeServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Employee> getAll(){
        return service.getAll();
    }

    @PostMapping ("/")
    public ResponseEntity<Employee> create(@RequestBody Employee employee){
        Employee createdEmployee = service.create(employee);
        if (createdEmployee == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class EmployeeController {
    @GetMapping("employees")
    public String sayHello(){
        return "Hello World!";
>>>>>>> origin/master
    }
}
