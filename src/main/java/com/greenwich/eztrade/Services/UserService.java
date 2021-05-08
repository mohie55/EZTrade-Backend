package com.greenwich.eztrade.Services;

import com.greenwich.eztrade.Models.User;
import com.greenwich.eztrade.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public HashMap<String, Object> checkUserCredentials(String email, String password) {

        HashMap<String, Object> loginResponse = new HashMap();
        User user = userRepository.checkUserCredentials(email, password);

        if (user != null) {
             loginResponse.put("message","success");
             loginResponse.put("user",user);
        } else {
            loginResponse.put("message","failed");
            loginResponse.put("user",user);
        }

        return loginResponse;
    }

    public HashMap<String, Object> registerUser(String firstName, String lastName, String email, String password) {

        HashMap<String, Object> registerUserResponse = new HashMap();
        User user = new User(firstName,lastName,email,password,0);
        try {
            userRepository.save(user);
            registerUserResponse.put("message","success");
        } catch (Exception e){
            e.printStackTrace();
            registerUserResponse.put("message","failed");
        }
        return registerUserResponse;
    }
}
