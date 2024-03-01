package kz.aitu.demo.models;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private boolean finished;
    private String date;
    private String time;
    private String shipping_method; }