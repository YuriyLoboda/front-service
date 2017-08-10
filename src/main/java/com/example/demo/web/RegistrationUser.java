package com.example.demo.web;

import com.example.demo.entity.ExternalUser;
import com.example.demo.service.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yulo0717 on 8/9/2017.
 */
@RestController
public class RegistrationUser {

    @Autowired
    private UserServiceClient userServiceClient;

    @PostMapping("/registration")
    public void registration(@RequestBody ExternalUser user){
        userServiceClient.createUser(user);
    }
}
