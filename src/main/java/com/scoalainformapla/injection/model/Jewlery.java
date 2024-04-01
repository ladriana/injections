package com.scoalainformapla.injection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

@Data
@AllArgsConstructor
public class Jewlery {
    private String type;
    private String name;
    private Double weight;
    private Integer karatGold;
    private String colour;
}
