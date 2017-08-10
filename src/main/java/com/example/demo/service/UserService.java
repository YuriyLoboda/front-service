package com.example.demo.service;

import com.example.demo.entity.ExternalUser;
import com.example.demo.entity.InternalUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserServiceClient userServiceClient;

    public void createUser(ExternalUser externalUser){
        userServiceClient.createUser(externalUser);

    }
}
