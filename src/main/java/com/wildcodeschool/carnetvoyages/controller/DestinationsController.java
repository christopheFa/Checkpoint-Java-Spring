package com.wildcodeschool.carnetvoyages.controller;

import com.wildcodeschool.carnetvoyages.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DestinationsController {

    @Autowired
    private DestinationService destinationService;

    @GetMapping("/destinations")
    public String getAllDestinations(Model model) {
        model.addAttribute("destinationList", destinationService.findAll() );
        return "destination";
    }
}
