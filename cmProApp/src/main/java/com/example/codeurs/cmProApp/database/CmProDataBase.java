package com.example.codeurs.cmProApp.database;

import com.example.codeurs.cmProApp.models.Client;
import com.example.codeurs.cmProApp.models.Tache;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class CmProDataBase {


    private static List<Tache> tacheList;

    private CmProDataBase() {

        this.tacheList = getListTacheDatabase();
    }


    public static List<Tache> getInstance() {
        if (!Optional.ofNullable(tacheList).isPresent()) {
            tacheList = getListTacheDatabase();
        }
        return tacheList;

    }

    public static List<Tache> getListTacheDatabase() {
        var tache1 = Tache.builder()
                .nom("Publication")
                .IdTaches(1)
                .build();


        var tache2 = Tache.builder()
                .IdTaches(2)
                .nom("Enrégistrerment de contact")
                .build();


        var tache3 = Tache.builder()
                .IdTaches(3)
                .nom("Création de liste de diffusion")
                .build();

        var tache4 = Tache.builder()
                .IdTaches(3)
                .nom("Création de liste de diffusion")
                .build();

        List<Tache> tacheList = new ArrayList();

        tacheList.add(tache1);
        tacheList.add(tache2);
        tacheList.add(tache3);
        tacheList.add(tache4);

        return tacheList;
    }







}

