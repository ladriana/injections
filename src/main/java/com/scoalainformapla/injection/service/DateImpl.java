package com.scoalainformapla.injection.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DateImpl {
    public String getDate(){
        return LocalDateTime.now().toString();
    }
}
