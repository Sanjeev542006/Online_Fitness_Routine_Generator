package com.Project.FitnessRoutineApp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "FitnessDetails")
public class FitnessDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private int id;
    @Column(name = "Workoutfrequency")
    private int workoutfrequency;
    @Column(name = "WorkoutType")
    private String workoutType;
    @Column(name = "NeededTransformation")
    private String neededTransformation;
    @Column(name="CurrentDiet")
    private String currentDiet;
}
