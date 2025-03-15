package com.Project.FitnessRoutineApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.hibernate.annotations.GenericGenerator;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Signup", uniqueConstraints = { @UniqueConstraint(columnNames = "emailaddress") })
public class SignupEntity {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(generator = MyGenerator.generatorName)
//    @GenericGenerator(name = MyGenerator.generatorName, strategy = "a.b.c.MyGenerator")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private int uid;
    @Column(name = "emailaddress")
    private String emailAddress;
    @Column(name = "password")
    private String password;
}
