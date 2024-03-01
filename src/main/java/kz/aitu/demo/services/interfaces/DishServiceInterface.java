package kz.aitu.demo.services.interfaces;

import kz.aitu.demo.models.Dish;

import java.util.List;

public interface DishServiceInterface {
    Dish delete(Dish dish);

    List<Dish> getAll();

    Dish create(Dish dish);
}
