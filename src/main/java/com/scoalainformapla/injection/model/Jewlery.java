package com.scoalainformapla.injection.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@AllArgsConstructor
@Builder
public class Jewlery {
    private String type;
    private String name;
    private Double weight;
    private Integer karatGold;
    private String colour;
}
