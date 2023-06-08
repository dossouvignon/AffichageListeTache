package com.example.codeurs.cmProApp.presentation;


import com.example.codeurs.cmProApp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/listedesclients")
    public String ListeClient ( Model model) {

        var clients = clientService.listClient();

        clients.stream().forEach(System.out::println);

        model.addAttribute("clients", clients);
        return "listedesclients";


    }

}

