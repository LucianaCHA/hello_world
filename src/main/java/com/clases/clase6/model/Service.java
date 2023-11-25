package com.clases.clase6.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "id_admin", referencedColumnName = "id")
    private AdminUser adminUser;
    @ManyToOne
    @JoinColumn(name = "id_asset", referencedColumnName = "id")
    private Asset asset;
    @OneToMany
    @JoinColumn(name = "id_service", referencedColumnName = "id")
    private List<Tasks> taskList;
}