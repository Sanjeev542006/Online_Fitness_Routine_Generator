package com.Project.FitnessRoutineApp.service;

import com.Project.FitnessRoutineApp.entity.FitnessDetails;
import com.Project.FitnessRoutineApp.repository.FitnessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FitnessDetailsService {

    @Autowired
    private FitnessRepo fitnessDetailsRepo;

    public List<FitnessDetails> getAllDetails() {
        return fitnessDetailsRepo.findAll();
    }

    public FitnessDetails addDetails(FitnessDetails fitnessDetails) {
        return fitnessDetailsRepo.save(fitnessDetails);
    }

    public String updateDetails(int uid, FitnessDetails updatedDetails) {
        Optional<FitnessDetails> existing = fitnessDetailsRepo.findById(uid);

        if (existing.isPresent()) {
            FitnessDetails existingDetails = existing.get();
            existingDetails.setWorkoutType(updatedDetails.getWorkoutType());
            existingDetails.setNeededTransformation(updatedDetails.getNeededTransformation());
            existingDetails.setCurrentDiet(updatedDetails.getCurrentDiet());
            fitnessDetailsRepo.save(existingDetails);
            return "Fitness details updated successfully";
        }
        return "No record found with given Workout Frequency";
    }

    public String deleteDetails(int uid) {
        Optional<FitnessDetails> existing = fitnessDetailsRepo.findById(uid);

        if (existing.isPresent()) {
            fitnessDetailsRepo.deleteById(uid);
            return "Deletion Success";
        }
        return "";
    }
}
