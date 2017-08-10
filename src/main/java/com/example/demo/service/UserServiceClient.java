package com.example.demo.service;

import com.example.demo.entity.ExternalUser;
import com.example.demo.entity.InternalUser;
import com.example.demo.infrastructure.Getaway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceClient {


@Autowired
    private Getaway getaway;

    public void createUser(ExternalUser externalUser) {
       getaway.post("http://localhost:8080/registration",externalUser);
    }
}
