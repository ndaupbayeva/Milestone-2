package kz.aitu.demo.services.interfaces;

import kz.aitu.demo.models.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    Employee create(Employee employee);
    Employee deleteById(int id);
    List<Employee> getAll();

}
