package com.scoalainformapla.injection.controller;

import com.scoalainformapla.injection.model.Jewlery;
import com.scoalainformapla.injection.model.WelcomeMsg;
import com.scoalainformapla.injection.service.JewleryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JewleryDevController {
    @Autowired
    WelcomeMsg welcomeMsg;

@Autowired
    Jewlery jewlery;

@Value("${brand.name}")
private String brandName;
    @GetMapping("/jewlery")
    public String getJewlery() {
        return welcomeMsg.getWelcomeMsg() + "<br> Jewlery available: " + jewlery.toString() +
                "<br> Brand: " + brandName;
    }


}
