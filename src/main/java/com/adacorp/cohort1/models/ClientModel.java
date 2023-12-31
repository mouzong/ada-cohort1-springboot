package com.adacorp.cohort1.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientModel {

    @Id
    @GeneratedValue
    private UUID idClient;

    private String nom;
    private String prenom;
    privte

    /**
     * 1 - Analyse du besoin :
     * 2 - Conception
     * 3 - Tests
     * 4 - Integration
     * 5 - Deployer
     * 6 - Maintenance
     *
     */


}
