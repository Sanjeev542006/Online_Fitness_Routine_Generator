package com.Project.FitnessRoutineApp.service;

import com.Project.FitnessRoutineApp.entity.LoginEntity;
import com.Project.FitnessRoutineApp.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    LoginRepo loginrepo;

    public LoginEntity loginDetails(LoginEntity login) {
        return loginrepo.save(login);
    }
     public List<LoginEntity> getAllLogins() {
        return loginrepo.findAll();
    }

//    -------------------
    public LoginEntity updateLogin(String emailid, LoginEntity updatedLogin) {
        Optional<LoginEntity> existingLoginOptional = loginrepo.findById(emailid);
        if (existingLoginOptional.isPresent()) {
            LoginEntity existingLogin = existingLoginOptional.get();
            existingLogin.setPassword(updatedLogin.getPassword());
            return loginrepo.save(existingLogin);
        } else {
            throw new RuntimeException("Login with this email => " + emailid + " not found");
        }
    }

    public void deleteLogin(String emailid) {
        if (loginrepo.existsById(emailid)) {
            loginrepo.deleteById(emailid);
        } else {
            throw new RuntimeException("Login with emailid " + emailid + " not found");
        }
    }

}
