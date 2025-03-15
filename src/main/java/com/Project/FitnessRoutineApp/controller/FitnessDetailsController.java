package com.Project.FitnessRoutineApp.controller;

import com.Project.FitnessRoutineApp.entity.FitnessDetails;
import com.Project.FitnessRoutineApp.service.FitnessDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fitness")
public class FitnessDetailsController {

    @Autowired
    private FitnessDetailsService fitnessDetailsService;

    @GetMapping("/getdetails")
    public List<FitnessDetails> getAllFitnessDetails() {
        return fitnessDetailsService.getAllDetails();
    }

    @PostMapping("/postdetails")
    public FitnessDetails postFitnessDetails(@RequestBody FitnessDetails fitnessDetails) {
        return fitnessDetailsService.addDetails(fitnessDetails);
    }

    @PutMapping("/putdetails/{uid}")
    public String putFitnessDetails(@PathVariable int uid, @RequestBody FitnessDetails updatedDetails) {
        return fitnessDetailsService.updateDetails(uid, updatedDetails);
    }

    @DeleteMapping("/deletedetails/{uid}")
    public String deleteFitnessDetails(@PathVariable int uid) {
        return fitnessDetailsService.deleteDetails(uid);
    }
}
