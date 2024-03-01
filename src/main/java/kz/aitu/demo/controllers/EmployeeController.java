package kz.aitu.demo.controllers;
import kz.aitu.demo.models.Employee;
import kz.aitu.demo.services.interfaces.EmployeeServiceInterface;
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
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id){
        Employee employee = service.deleteById(id);
        if (employee == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
