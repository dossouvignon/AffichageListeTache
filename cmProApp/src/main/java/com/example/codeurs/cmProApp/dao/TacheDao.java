package com.example.codeurs.cmProApp.dao;

import com.example.codeurs.cmProApp.database.CmProDataBase;
import com.example.codeurs.cmProApp.models.Tache;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TacheDao {

    public List<Tache> getAll() {

        CmProDataBase.getInstance().stream().forEach(System.out::println);

        return CmProDataBase.getInstance();
    }

    public Tache getOneTache(int index) {

        return CmProDataBase.getInstance().get(index);

    }

    public List<Tache> save(Tache tache) {
        var tacheList = CmProDataBase.getInstance();
        tacheList.add(tache);
        return tacheList;
    }

    public List<Tache> delete(Tache tache) {
        var tacheList = CmProDataBase.getInstance();
        tacheList.remove(tache);
        return tacheList;
    }
}
