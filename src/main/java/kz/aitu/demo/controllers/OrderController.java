package kz.aitu.demo.controllers;
import kz.aitu.demo.models.Employee;
import kz.aitu.demo.models.Order;
import kz.aitu.demo.services.interfaces.OrderServiceInterface;
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
    public List<Order> getAll(){
        return service.getAll();
    }

    @PostMapping ("/")
    public ResponseEntity<Order> create(@RequestBody Order order){
        Order createdOrder = service.create(order);
        if (createdOrder == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }}
