package com.scoalainformapla.injection.controller;

import com.scoalainformapla.injection.model.WelcomeMsg;
import com.scoalainformapla.injection.service.DateImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateAndTimeController {
    @Autowired
    WelcomeMsg welcomeMsg;
    @Autowired
    DateImpl date;

    @GetMapping("/date")
    public String getDateAndTime() {
        return welcomeMsg.getWelcomeMsg() + "<br> Local date and time is: " + date.getDate();
    }
}
