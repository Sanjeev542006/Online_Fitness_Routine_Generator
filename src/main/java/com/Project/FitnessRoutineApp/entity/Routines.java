package com.Project.FitnessRoutineApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name ="routines")
public class Routines {
    @Id
    @Column(name="routineId")
    private int routineId;
    @Column(name = "exerciseId")
    private int exerciseId;
    @Column(name = "exercideName")
    private String exercideName;
    @Column(name = "exerciseCount")
    private int exerciseCount;
}
