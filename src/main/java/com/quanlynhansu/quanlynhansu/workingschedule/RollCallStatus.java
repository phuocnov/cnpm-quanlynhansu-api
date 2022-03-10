package com.quanlynhansu.quanlynhansu.workingschedule;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "rollcall_status")
@Table
public class RollCallStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
}
