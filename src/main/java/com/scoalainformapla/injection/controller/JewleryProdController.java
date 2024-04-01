package com.scoalainformapla.injection.controller;

import com.scoalainformapla.injection.model.Jewlery;
import com.scoalainformapla.injection.model.WelcomeMsg;
import com.scoalainformapla.injection.service.JewleryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JewleryProdController {


    private final JewleryImpl jewleryI;

    public JewleryProdController(Jewlery jewlery, JewleryImpl jewleryI) {
        this.jewleryI = jewleryI;
    }

    @Value("${brand.name}")
private String brandName;


    @GetMapping("/jewleryprod")
    public String getAllJewlery() {
        return   " Jewlery available: " + jewleryI.getAllJewlerys() +
                "<br> Brand: " + brandName;
    }
}
