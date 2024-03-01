package kz.aitu.demo.models;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private int age;
    private boolean gender;

}