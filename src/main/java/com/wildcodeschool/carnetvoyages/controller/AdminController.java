package com.wildcodeschool.carnetvoyages.controller;


import com.wildcodeschool.carnetvoyages.entity.Destination;
import com.wildcodeschool.carnetvoyages.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admin")
    public String index(Model model)
    {
        model.addAttribute("destinationList",adminService.findAllDestinations() );
        return "admin";
    }

    @PostMapping("/admin/destinations")
    public String saveDestination(@ModelAttribute Destination destination) {
        adminService.save(destination);
        return "redirect:/admin";
    }

    @PostMapping("/admin/destinations/delete/{idDestination}")
    public String removeDestination(@PathVariable Long idDestination) {
        adminService.remove(idDestination);
        return "redirect:/admin";
    }
}