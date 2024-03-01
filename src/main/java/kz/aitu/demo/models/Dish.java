package kz.aitu.demo.models;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name="dishes")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int difficulty;
    private int cost;

}