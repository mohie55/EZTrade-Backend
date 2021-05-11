package com.greenwich.eztrade.Controllers;

import com.greenwich.eztrade.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public HashMap<String, Object> login(@RequestParam String email, @RequestParam String password) {

        return userService.checkUserCredentials(email, password);
    }

        @PostMapping("/register")
    public HashMap<String, Object> registerUser(@RequestParam String firstName, @RequestParam String lastName,@RequestParam String email, @RequestParam String password){

        return userService.registerUser(firstName,lastName,email,password);
    }

    @GetMapping("/getSellerDetails")
    public HashMap<String, Object> getSellerDetails(int userId) {

        return userService.getSellerDetails(userId);
    }



}
