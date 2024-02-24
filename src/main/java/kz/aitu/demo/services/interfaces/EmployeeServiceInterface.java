package kz.aitu.demo.services.interfaces;

import kz.aitu.demo.models.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    Employee create(Employee employee);
    Employee delete(Employee employee);
    List<Employee> getAll();
}
