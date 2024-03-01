package kz.aitu.demo.repositories;
import kz.aitu.demo.models.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepositoryInterface extends JpaRepository<Dish, Integer> {

}
