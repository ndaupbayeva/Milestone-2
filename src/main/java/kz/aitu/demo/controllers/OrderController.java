package kz.aitu.demo.controllers;
import kz.aitu.demo.models.Employee;

import kz.aitu.demo.services.interfaces.OrderServiceInterface;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {

    private final OrderServiceInterface service;

    public OrderController(OrderServiceInterface service) {
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
    }}
