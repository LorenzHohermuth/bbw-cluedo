package ch.bbw.cge.cluedo.controller;

import ch.bbw.cge.cluedo.model.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private DataService service;

    @GetMapping("/clue")
    public String showView(Model model){
        System.out.println("HomeController.showView");
        model.addAttribute("persons", service.getPersons() );
        model.addAttribute("weapons", service.getWeapons() );
        model.addAttribute("rooms", service.getRooms() );
        return "cluedo";
    }
}