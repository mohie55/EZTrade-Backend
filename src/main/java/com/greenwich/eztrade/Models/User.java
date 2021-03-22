package com.greenwich.eztrade.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("user_t")
public class User {

    @Id
    @Column("id_users")
    private int id;

    @Column("first_name")
    private String firstName;

    @Column("last_name")
    private String lastName;

    private String email;

    @Column("pass")
    private String password;

    private int reviews;

    public User(String firstName, String lastName, String email, String password, int reviews) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.reviews = reviews;
    }
}
