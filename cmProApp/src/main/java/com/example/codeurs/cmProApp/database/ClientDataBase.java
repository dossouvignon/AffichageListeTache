package com.example.codeurs.cmProApp.database;

import com.example.codeurs.cmProApp.models.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class ClientDataBase {

    private static List<Client> clientList;

    private ClientDataBase() {

        this.clientList = getListClientDatabase();
    }


    public static List<Client> getInstance() {
        if (!Optional.ofNullable(clientList).isPresent()) {
            clientList = getListClientDatabase();
        }
        return clientList;

    }

    public static List<Client> getListClientDatabase() {
        var client1 = Client.builder()
                .idClient(1)
                .nom("SOSSA")
                .prenom("Henri").
                adressHabitation("Akpakpa")
                .numeroTelephone("01-02-20-33")
                .adressMail("soss.@gmail.com")
                .build();




        var client2 = Client.builder()
                .idClient(2)
                .nom("AGOSSA")
                .prenom("Rémi").
                adressHabitation("Paris")
                .numeroTelephone("44-12-22-33")
                .adressMail("agoss.@gmail.com")
                .build();


        var client3 = Client.builder()
                .idClient(3)
                .nom("BONOU")
                .prenom("Finagnon").
                adressHabitation("Lokossa")
                .numeroTelephone("01-02-56-90")
                .adressMail("fign.@gmail.com")
                .build();


        var client4 = Client.builder()
                .idClient(4)
                .nom("Hounssou")
                .prenom("Ifê").
                adressHabitation("Porto-Novo")
                .numeroTelephone("70-02-66-90")
                .adressMail("ife.@gmail.com")
                .build();

        List<Client> clientList = new ArrayList();

        clientList.add(client1);
        clientList.add(client2);
        clientList.add(client3);
        clientList.add(client4);

        return clientList;
    }




}
