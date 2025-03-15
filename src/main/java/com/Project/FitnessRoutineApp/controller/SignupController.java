package com.Project.FitnessRoutineApp.controller;

import com.Project.FitnessRoutineApp.entity.SignupEntity;
import com.Project.FitnessRoutineApp.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/signup")
public class SignupController {
    @Autowired
    SignupService signupService;

    @GetMapping("/getdetails")
    public List<SignupEntity> getSignupDetails() {
        return signupService.getDetails();
    }

    @PostMapping("/postdetails")
    public SignupEntity postSignupDetails(@RequestBody SignupEntity signupEntity) {
        return signupService.postDetails(signupEntity);
    }
    
    @PutMapping("/putdetails/{emailAddress}")
    public String putSignupDetails(@RequestBody SignupEntity signupEntity, @PathVariable String emailAddress) {
        return signupService.updateDetails(signupEntity,emailAddress);
    }

    @DeleteMapping("/deletedetails/{emailAddress}")
    public String deleteSignupDetails(@PathVariable String emailAddress) {
        return signupService.deleteDetails(emailAddress);
    }
}
