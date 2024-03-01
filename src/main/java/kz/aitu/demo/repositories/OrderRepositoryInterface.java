package kz.aitu.demo.repositories;
import kz.aitu.demo.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositoryInterface extends JpaRepository<Order, Integer> {

}
