package com.scoalainformapla.injection.service;

import com.scoalainformapla.injection.model.Jewlery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class JewleryImpl {
    List<Jewlery> jewleryList = new ArrayList<>();

    public String getAllJewlerys(){
        Jewlery jul1 = Jewlery.builder()
                .colour("red")
                .name("infinity")
                .karatGold(14)
                .type("ring")
                .weight(3.62)

                .build();
        jewleryList.add(jul1);
        Jewlery jul2 = Jewlery.builder()
                .colour("white")
                .name("infinity")
                .karatGold(18)
                .type("ring")
                .weight(4.22)

                .build();
        jewleryList.add(jul2);
        Jewlery jul3 = Jewlery.builder()
                .colour("white")
                .name("infinity")
                .karatGold(14)
                .type("chain")
                .weight(7.20)

                .build();
        jewleryList.add(jul3);
        for (Jewlery jul: jewleryList) {
            return jewleryList.toString();
        }
        return "List of the jewleris is:" + jewleryList.toString();
    }
}
