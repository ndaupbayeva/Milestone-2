package kz.aitu.demo.services;

import kz.aitu.demo.models.Order;
import kz.aitu.demo.repositories.OrderRepositoryInterface;
import kz.aitu.demo.services.interfaces.OrderServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService implements OrderServiceInterface {

    private final OrderRepositoryInterface repo;

    public OrderService(OrderRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public Order create(Order order) {
        return repo.save(order);
    }

    @Override
    public Order deleteById(int id) {
        return null;
    }

    public List<Order> getAll() {
        return repo.findAll();
    }
}
