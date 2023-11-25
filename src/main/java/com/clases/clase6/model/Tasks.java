package com.clases.clase6.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "task")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private double price;
}	