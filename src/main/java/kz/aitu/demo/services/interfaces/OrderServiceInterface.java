package kz.aitu.demo.services.interfaces;

import kz.aitu.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderServiceInterface extends JpaRepository<Employee, Integer> {

    List<Employee> getAll();

    Employee create(Employee employee);
}
