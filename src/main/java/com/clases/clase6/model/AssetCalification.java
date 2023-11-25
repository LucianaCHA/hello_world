package com.clases.clase6.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="asset_calification")
public class AssetCalification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Contract contract;
    @OneToOne
    private Asset asset;
    private int stars;
    private String review;
}
