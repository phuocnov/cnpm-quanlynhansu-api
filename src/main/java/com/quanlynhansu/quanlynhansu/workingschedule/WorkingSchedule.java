package com.quanlynhansu.quanlynhansu.workingschedule;

import java.time.LocalTime;

import com.quanlynhansu.quanlynhansu.shift.Shift;
import com.quanlynhansu.quanlynhansu.user.User;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "working_schedule")
@Table
public class WorkingSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shift_id", referencedColumnName = "id")
    private Shift shift;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_id", referencedColumnName = "id")
    private User staff;

    private LocalTime timeIn;
    private LocalTime timeOut;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "status", referencedColumnName = "id")
    private RollCallStatus status;
}
