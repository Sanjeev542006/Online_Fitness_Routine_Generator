package com.Project.FitnessRoutineApp.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name="Userdata")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private int uid;
    @Column(name="username")
    private String username;
    @Column(name="FirstName")
    private String firstName;
    @Column(name="LastName")
    private char lastName;
    @Column(name="Age")
    private int age;
}
