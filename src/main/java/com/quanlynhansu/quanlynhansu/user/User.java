package com.quanlynhansu.quanlynhansu.user;

import java.sql.Date;

import com.quanlynhansu.quanlynhansu.branch.Branch;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="user")
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private Date dateOfBirth;
    private String homeTown;
    private String address;
    private String sex;
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "branch", referencedColumnName = "id")
    private Branch branch;
}
