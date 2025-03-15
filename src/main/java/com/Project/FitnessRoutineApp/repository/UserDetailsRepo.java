package com.Project.FitnessRoutineApp.repository;

import com.Project.FitnessRoutineApp.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer> {
}
