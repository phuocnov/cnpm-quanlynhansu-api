package com.quanlynhansu.quanlynhansu.account;

import com.quanlynhansu.quanlynhansu.user.User;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
