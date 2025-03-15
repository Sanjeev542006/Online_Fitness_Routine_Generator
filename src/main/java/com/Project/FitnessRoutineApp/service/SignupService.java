package com.Project.FitnessRoutineApp.service;

import com.Project.FitnessRoutineApp.entity.SignupEntity;
import com.Project.FitnessRoutineApp.repository.SignupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SignupService {
    @Autowired
    SignupRepo signupRepo;

    public List<SignupEntity> getDetails(){
        return signupRepo.findAll();
    }

    public SignupEntity postDetails(SignupEntity signupEntity ) {
        return signupRepo.save(signupEntity);
    }
    
    public String updateDetails(SignupEntity signupEntity, String emailAddress) {
        Optional<SignupEntity> existing = signupRepo.findByEmailAddress(emailAddress);
        if(existing.isPresent()){
            SignupEntity exist = existing.get();
            exist.setPassword(signupEntity.getPassword());
            signupRepo.save(exist);
            return "UPdate Success";
        }
        return "No such email address";
    }

    public String deleteDetails(String emailAddress) {
        Optional<SignupEntity> existing = signupRepo.findByEmailAddress(emailAddress);
        if(existing.isPresent()){
            signupRepo.delete(existing.get());
            return "Delete Success";
        }
        return "No such email address";
    }

}
