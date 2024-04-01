package com.scoalainformapla.injection.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
@Data
public class DateTime {
    private LocalDate localDate;
    private LocalTime localTime;
}
