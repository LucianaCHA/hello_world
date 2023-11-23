package models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
@Table(name="asset")
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String lastname;
    private String email;
    private String availability;
    private String area;
    private LocalDate birth_date;
    private String identification_type;
    private long identification;
    private long cuit;
    private String phone;
    private String work_hours;
}
