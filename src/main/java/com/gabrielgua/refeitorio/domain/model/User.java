package com.gabrielgua.refeitorio.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @EqualsAndHashCode.Include
    private Long ID;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;

}