package com.Project.FitnessRoutineApp.controller;

import com.Project.FitnessRoutineApp.entity.LoginEntity;
import com.Project.FitnessRoutineApp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService login;

    @GetMapping("/")
    public String index() {
        return "Hello World from Controller class";
    }

    @PostMapping("/logindata")
    public LoginEntity controllerLoginDetails(@RequestBody LoginEntity loginEntity) {
        return login.loginDetails(loginEntity);
    }

    @GetMapping("/fetchlogindata")
    public List<LoginEntity> controllerLoginDetails() {
        return login.getAllLogins();
    }

//    -----------------
    @PutMapping("/{emailid}")
    public LoginEntity updateLogin(@PathVariable String emailid, @RequestBody LoginEntity updatedLogin) {
        return login.updateLogin(emailid, updatedLogin);
    }
    @DeleteMapping("/{emailid}")
    public String deleteLogin(@PathVariable String emailid) {
        login.deleteLogin(emailid);
        return "Login with emailid " + emailid + " deleted successfully";
    }
}
