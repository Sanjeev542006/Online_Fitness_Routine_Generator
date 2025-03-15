package com.Project.FitnessRoutineApp.controller;

import com.Project.FitnessRoutineApp.entity.UserDetails;
import com.Project.FitnessRoutineApp.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserDetailsController {

    @Autowired
    private UserDetailsService userDetailsService;

    @GetMapping("/getdetails")
    public List<UserDetails> getAllUsers() {
        return userDetailsService.getAllUsers();
    }

    @PostMapping("/postdetails")
    public UserDetails postUser(@RequestBody UserDetails userDetails) {
        return userDetailsService.addUser(userDetails);
    }

    @PutMapping("/putdetails/{uid}")
    public String updateUser(@PathVariable int uid, @RequestBody UserDetails updatedUser) {
        return userDetailsService.updateUser(uid, updatedUser);
    }

    @DeleteMapping("/deletedetails/{uid}")
    public String deleteUser(@PathVariable int uid) {
        return userDetailsService.deleteUser(uid);
    }
}
