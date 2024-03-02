package kz.aitu.demo.services.interfaces;
import kz.aitu.demo.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderServiceInterface{
    Order deleteById(int id);
    List<Order> getAll();
    Order create(Order order);
}
