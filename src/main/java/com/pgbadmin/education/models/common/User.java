package com.pgbadmin.education.models.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long userId;
    private String userName;
    private String password;
    private boolean isActive;
}
