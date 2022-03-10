package com.quanlynhansu.quanlynhansu.shift;

import java.time.LocalTime;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "shift")
@Table
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private LocalTime startHour;
    private LocalTime endHour;
}
