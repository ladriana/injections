package com.scoalainformapla.injection.config;

import com.scoalainformapla.injection.model.Jewlery;
import com.scoalainformapla.injection.model.WelcomeMsg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public WelcomeMsg getWelcomeMsg() {
        return new WelcomeMsg(" <h1> Hello to you againe</h1>");
    }

    @Bean
    public Jewlery getJewlery() {
        return new Jewlery("ring", "infinity", 4.3, 18, "white");
    }
}