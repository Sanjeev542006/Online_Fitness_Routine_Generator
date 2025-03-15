package com.Project.FitnessRoutineApp.repository;

import com.Project.FitnessRoutineApp.entity.FitnessDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FitnessRepo extends JpaRepository<FitnessDetails, Integer> {
}
