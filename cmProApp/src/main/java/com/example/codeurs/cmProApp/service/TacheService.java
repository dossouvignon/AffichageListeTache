package com.example.codeurs.cmProApp.service;

import com.example.codeurs.cmProApp.dao.TacheDao;
import com.example.codeurs.cmProApp.models.Tache;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor // L'injection de dépendance
public class TacheService {

    private final TacheDao tacheDao;

    /*public TacheService(TacheDao tacheDao) {
        this.tacheDao = tacheDao;
    }*/
    public List<Tache> listTache() {

        tacheDao.getAll().stream().forEach(System.out::println);

        return tacheDao.getAll();
    }


    /*public String tacheCommençantAvecE() {
        var tachess = tacheDao.getAll();

        var nomPremiereTache = tachess
                .stream()
                .filter(tache -> tache.getNom().startsWith("E")).toString();
        return nomPremiereTache;
    }*/


    public String tacheCommençantAvecE() {
        var tachess = tacheDao.getAll();

        var nomPremiereTache = tachess
                .stream()
                .map(tache -> tache.getNom())
                .findFirst()
                .get();
        return nomPremiereTache;
    }

}

