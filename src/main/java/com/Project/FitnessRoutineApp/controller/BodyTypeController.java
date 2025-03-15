package com.Project.FitnessRoutineApp.controller;

import com.Project.FitnessRoutineApp.entity.BodyType;
import com.Project.FitnessRoutineApp.service.BodyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bodytype")
public class BodyTypeController {

    @Autowired
    private BodyTypeService bodyTypeService;

    @GetMapping("/getdetails")
    public List<BodyType> getAllBodyTypeDetails() {
        return bodyTypeService.getAllDetails();
    }

    @PostMapping("/postdetails")
    public BodyType postBodyTypeDetails(@RequestBody BodyType bodyType) {
        return bodyTypeService.addDetails(bodyType);
    }

    @PutMapping("/putdetails/{id}")
    public String putBodyTypeDetails(@PathVariable int uid, @RequestBody BodyType updatedDetails) {
        return bodyTypeService.updateDetails(uid, updatedDetails);
    }

    @DeleteMapping("/deletedetails/{id}")
    public String deleteBodyTypeDetails(@PathVariable int uid) {
        return bodyTypeService.deleteDetails(uid);
    }
}
