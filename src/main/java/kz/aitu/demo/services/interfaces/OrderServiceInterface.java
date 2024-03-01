package kz.aitu.demo.services.interfaces;

import kz.aitu.demo.models.Employee;
import kz.aitu.demo.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderServiceInterface extends JpaRepository<Employee, Integer> {

    List<Order> getAll();

    Employee create(Order employee);
}
