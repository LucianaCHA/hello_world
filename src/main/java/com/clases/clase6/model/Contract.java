package com.clases.clase6.model;
import java.time.LocalDate;
import java.util.List;

import enums.ContractStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "contract")
@Data
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate date;
    private String location;
    private String work_hours;
    private ContractStatus status;
    @ManyToMany
    @JoinTable(
            name = "contract_duty",
            joinColumns = @JoinColumn(name = "id_contract"),
            inverseJoinColumns = @JoinColumn(name = "id_duty"))
    private List<Tasks> taskList;
    @ManyToMany
    @JoinTable(
            name = "contract_asset",
            joinColumns = @JoinColumn(name = "id_contract"),
            inverseJoinColumns = @JoinColumn(name = "id_asset"))
    private List<Asset> assetList;
    @ManyToOne
    @JoinColumn(name = "id_custumer", referencedColumnName = "id")
    private Customer custumer;
}