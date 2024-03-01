package kz.aitu.demo.services;

import kz.aitu.demo.models.Order;
import kz.aitu.demo.repositories.OrderRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {

    private final OrderRepositoryInterface repo;

    public OrderService(OrderRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public Order create(Order order) {
        return repo.save(order);
    }

    @Override
    public Order delete(Order order) {
        return null;
    }

    public List<Order> getAll() {
        return repo.findAll();
    }
}
