package kz.aitu.demo.models;

import jakarta.persistence.*;
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
    private String position;
    private int age;
    private boolean gender; }
