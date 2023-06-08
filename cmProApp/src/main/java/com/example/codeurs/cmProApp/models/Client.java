package com.example.codeurs.cmProApp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Client {
    private int idClient;
    private String nom;
    private String prenom;
    private String adressMail;
    private String adressHabitation;
    private String numeroTelephone;

}
