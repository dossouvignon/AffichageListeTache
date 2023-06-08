package com.example.codeurs.cmProApp.service;

import com.example.codeurs.cmProApp.dao.ClientDao;
import com.example.codeurs.cmProApp.dao.TacheDao;

import com.example.codeurs.cmProApp.models.Client;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService {

@Autowired
    private final ClientDao clientDao;

    /*public TacheService(TacheDao tacheDao) {
        this.tacheDao = tacheDao;
    }*/
    public List<Client> listClient() {

        clientDao.getAll().stream().forEach(System.out::println);

        return clientDao.getAll();
    }


    /*public String tacheCommençantAvecE() {
        var tachess = tacheDao.getAll();

        var nomPremiereTache = tachess
                .stream()
                .filter(tache -> tache.getNom().startsWith("E")).toString();
        return nomPremiereTache;
    }*/


    public String clientCommençantAvecE() {
        var clients = clientDao.getAll();

        var nomPremierClient = clients
                .stream()
                .map(client -> client.getNom())
                .findFirst()
                .get();
        return nomPremierClient;
    }

}




