package com.Project.FitnessRoutineApp.repository;

import com.Project.FitnessRoutineApp.entity.Routines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutinesRepo extends JpaRepository<Routines, Integer> {
}
