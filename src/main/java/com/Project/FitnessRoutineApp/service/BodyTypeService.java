package com.Project.FitnessRoutineApp.service;

import com.Project.FitnessRoutineApp.entity.BodyType;
import com.Project.FitnessRoutineApp.repository.BodyTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BodyTypeService {

    @Autowired
    private BodyTypeRepo bodyTypeRepo;

    public List<BodyType> getAllDetails() {
        return bodyTypeRepo.findAll();
    }

    public BodyType addDetails(BodyType bodyType) {
        return bodyTypeRepo.save(bodyType);
    }

    public String updateDetails(int uid, BodyType updatedDetails) {
        Optional<BodyType> existing = bodyTypeRepo.findById(uid);

        if (existing.isPresent()) {
            BodyType existingDetails = existing.get();
            existingDetails.setBodyType(updatedDetails.getBodyType());
            existingDetails.setHeight(updatedDetails.getHeight());
            existingDetails.setWeight(updatedDetails.getWeight());
            existingDetails.setWaist(updatedDetails.getWaist());
            existingDetails.setNeck(updatedDetails.getNeck());
            bodyTypeRepo.save(existingDetails);
            return "Body type details updated successfully";
        }
        return "No record found with given ID";
    }

    public String deleteDetails(int uid) {
        Optional<BodyType> existing = bodyTypeRepo.findById(uid);

        if (existing.isPresent()) {
            bodyTypeRepo.deleteById(uid);
            return "Body type details deleted successfully";
        }
        return "No record found with given ID";
    }
}
