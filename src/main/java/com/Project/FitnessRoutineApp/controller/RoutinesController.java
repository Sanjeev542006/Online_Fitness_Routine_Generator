package com.Project.FitnessRoutineApp.controller;

import com.Project.FitnessRoutineApp.entity.Routines;
import com.Project.FitnessRoutineApp.service.RoutinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/routine")
public class RoutinesController {
    @Autowired
    RoutinesService routinesService;
    @GetMapping("/getroutines")
    public List<Routines> getRoutines() {
        return routinesService.getAllRoutines();
    }
}
