package com.quanlynhansu.quanlynhansu.workingdate;

import java.time.LocalDate;

import com.quanlynhansu.quanlynhansu.branch.Branch;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity(name = "working_date")
@Table
public class WorkingDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate date;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id", referencedColumnName = "id")
    private Branch branch;
}
