package com.Project.FitnessRoutineApp.repository;

import com.Project.FitnessRoutineApp.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<LoginEntity, String> {
}
