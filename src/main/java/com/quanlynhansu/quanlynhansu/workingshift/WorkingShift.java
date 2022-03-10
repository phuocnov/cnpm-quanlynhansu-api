package com.quanlynhansu.quanlynhansu.workingshift;

import jakarta.persistence.Id;
import lombok.Data;

import com.quanlynhansu.quanlynhansu.shift.Shift;
import com.quanlynhansu.quanlynhansu.workingdate.WorkingDate;

import jakarta.persistence.*;

@Entity
@Table
@Data
public class WorkingShift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int maxStaff;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shift_id", referencedColumnName = "id")
    private Shift shift;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "date_id", referencedColumnName = "id")
    private WorkingDate date;
}
