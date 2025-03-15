package com.Project.FitnessRoutineApp.service;

import com.Project.FitnessRoutineApp.entity.Routines;
import com.Project.FitnessRoutineApp.repository.RoutinesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutinesService{
    @Autowired
    RoutinesRepo routinesRepo;
    public List<Routines> getAllRoutines() {
        return routinesRepo.findAll();
    }
}
