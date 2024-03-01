package kz.aitu.demo.services.interfaces;

import kz.aitu.demo.models.Dish;

import java.util.List;

public interface DishServiceInterface {
    Dish deleteById(int id);

    List<Dish> getAll();

    Dish create(Dish dish);
}
