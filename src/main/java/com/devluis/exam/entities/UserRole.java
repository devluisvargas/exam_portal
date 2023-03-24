package com.devluis.exam.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class UserRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long useRoleId;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
    @ManyToOne
    private Role role;
}
