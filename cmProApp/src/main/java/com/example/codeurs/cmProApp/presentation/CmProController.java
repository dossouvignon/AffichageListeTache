package com.example.codeurs.cmProApp.presentation;

import com.example.codeurs.cmProApp.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CmProController {

    @Autowired
    private TacheService tacheService;

    @GetMapping("/listetaches")
    public String ListeTache( Model model) {

        var taches = tacheService.listTache();

        taches.stream().forEach(System.out::println);

        model.addAttribute("taches", taches);
        return "listetaches";
    }

}