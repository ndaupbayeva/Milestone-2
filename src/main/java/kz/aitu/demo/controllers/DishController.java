package kz.aitu.demo.controllers;
import kz.aitu.demo.models.Dish;
import kz.aitu.demo.services.interfaces.DishServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dishes")

public class DishController {

    private final DishServiceInterface service;

    public DishController(DishServiceInterface service) {
        this.service = service;
    }
    @GetMapping("/")
    public List<Dish> getAll(){
        return service.getAll();
    }

    @PostMapping ("/")
    public ResponseEntity<Dish> create(@RequestBody Dish dish){
        Dish createdDish = service.create(dish);
        if (createdDish== null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdDish, HttpStatus.CREATED);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id){
        Dish dish = service.deleteById(id);
        if (dish == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
