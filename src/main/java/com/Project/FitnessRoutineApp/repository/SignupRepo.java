package com.Project.FitnessRoutineApp.repository;

import com.Project.FitnessRoutineApp.entity.SignupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SignupRepo extends JpaRepository<SignupEntity,Integer>
{
    Optional<SignupEntity> findByEmailAddress(String emailAddress);
}