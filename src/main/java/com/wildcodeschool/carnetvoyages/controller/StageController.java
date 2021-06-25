package com.wildcodeschool.carnetvoyages.controller;

import com.wildcodeschool.carnetvoyages.entity.Destination;
import com.wildcodeschool.carnetvoyages.entity.Stage;
import com.wildcodeschool.carnetvoyages.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class StageController {

    @Autowired
    private DestinationService destinationService;

    @GetMapping("/destinations/{idDest}/stages")
    public String getStageListPage(Model model, @PathVariable Long idDest) {

        if (idDest != null) {
            Optional<Destination> optionalDestination = destinationService.findById(idDest);
            Destination destination = new Destination();
            List<Stage> stages = new ArrayList<>();
            if (optionalDestination.isPresent()) {
                destination = optionalDestination.get();
                stages = optionalDestination.get().getStageList();
                model.addAttribute("destination",destination);
                model.addAttribute("stageList",stages);
                return "stage";
            }

        }

        return "redirect:/destinations";
    }
}
