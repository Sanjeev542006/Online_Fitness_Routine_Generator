package com.Project.FitnessRoutineApp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "BodyDetails")
public class BodyType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private int uid;
    @Column(name="BodyType")
    private String bodyType;
    @Column(name = "Height")
    private int height;
    @Column(name = "Weight")
    private int weight;
    @Column(name = "Waist")
    private int waist;
    @Column(name = "Neck")
    private int neck;
}
