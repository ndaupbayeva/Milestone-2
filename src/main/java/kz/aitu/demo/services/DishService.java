package kz.aitu.demo.services;

import kz.aitu.demo.models.Dish;
import kz.aitu.demo.models.Employee;
import kz.aitu.demo.repositories.DishRepositoryInterface;
import kz.aitu.demo.services.interfaces.DishServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DishService implements DishServiceInterface {

    private final DishRepositoryInterface repo;

    public DishService(DishRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public Dish create(Dish dish) {
        return repo.save(dish);
    }

    @Override
    public Dish deleteById(int id) {
        Optional<Dish> dish = repo.findById(id);
        if (dish.isPresent()) {
            repo.deleteById(id);
            return dish.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Dish> getAll() {
        return repo.findAll();
    }
}
