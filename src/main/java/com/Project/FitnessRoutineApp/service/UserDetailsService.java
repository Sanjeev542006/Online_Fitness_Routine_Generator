package com.Project.FitnessRoutineApp.service;

import com.Project.FitnessRoutineApp.entity.UserDetails;
import com.Project.FitnessRoutineApp.repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDetailsService {

    @Autowired
    private UserDetailsRepo userDetailsRepo;

    public List<UserDetails> getAllUsers() {
        return userDetailsRepo.findAll();
    }

    public UserDetails addUser(UserDetails userDetails) {
        return userDetailsRepo.save(userDetails);
    }

    public String updateUser(int uid, UserDetails updatedUser) {
        Optional<UserDetails> existingUser = userDetailsRepo.findById(uid);

        if (existingUser.isPresent()) {
            UserDetails user = existingUser.get();
            user.setUsername(updatedUser.getUsername());
            user.setFirstName(updatedUser.getFirstName());
            user.setLastName(updatedUser.getLastName());
            user.setAge(updatedUser.getAge());
            userDetailsRepo.save(user);
            return "User details updated successfully";
        }
        return "No user found with given ID";
    }

    public String deleteUser(int uid) {
        Optional<UserDetails> existingUser = userDetailsRepo.findById(uid);
        if (existingUser.isPresent()) {
            userDetailsRepo.deleteById(uid);
            return "User deleted successfully";
        }
        return "No user found with given ID";
    }
}
