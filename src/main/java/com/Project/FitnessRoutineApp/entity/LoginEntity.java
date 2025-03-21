package com.Project.FitnessRoutineApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "Login")
public class LoginEntity {
    @Id
    @Column(name = "emailaddress")
    private String emailid;
    @Column(name = "password")
    private String password;
}
