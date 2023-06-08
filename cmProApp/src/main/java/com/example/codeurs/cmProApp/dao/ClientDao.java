package com.example.codeurs.cmProApp.dao;

import com.example.codeurs.cmProApp.database.ClientDataBase;

import com.example.codeurs.cmProApp.models.Client;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientDao {

    public List<Client> getAll() {

        ClientDataBase.getInstance().stream().forEach(System.out::println);

        return ClientDataBase.getInstance();
    }

    public Client getOneClient(int index) {

        return ClientDataBase.getInstance().get(index);

    }

    public List<Client> save(Client client) {
        var clientList = ClientDataBase.getInstance();
        clientList.add(client);
        return clientList;
    }

    public List<Client> delete(Client client) {
        var clientList = ClientDataBase.getInstance();
        clientList.remove(client);
        return clientList;
    }


}
