package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tokens")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Token {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String token;
    private Date created_date;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Usuarios user;

    public Token(Usuarios user) {
        this.user = user;
        this.created_date = new Date();
        this.token = UUID.randomUUID().toString();
    }
}
