package kz.aitu.demo.services;

import kz.aitu.demo.models.Dish;
import kz.aitu.demo.repositories.DishRepositoryInterface;
import kz.aitu.demo.services.interfaces.DishServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public Dish delete(Dish dish) {
        return null;
    }

    @Override
    public List<Dish> getAll() {
        return repo.findAll();
    }
}
