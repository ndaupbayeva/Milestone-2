package kz.aitu.demo.services;

import kz.aitu.demo.models.Employee;
import kz.aitu.demo.repositories.EmployeeRepositoryInterface;
import kz.aitu.demo.services.interfaces.EmployeeServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService implements EmployeeServiceInterface {

    private final EmployeeRepositoryInterface repo;

    public EmployeeService(EmployeeRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public Employee create(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public Employee delete(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return repo.findAll();
    }
}
