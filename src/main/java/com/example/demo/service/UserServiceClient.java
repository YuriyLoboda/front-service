package com.example.demo.service;

import com.example.demo.entity.ExternalUser;
import com.example.demo.entity.InternalUser;
import com.example.demo.infrastructure.Getaway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceClient {


@Autowired
    private Getaway getaway;

    public InternalUser createUser(ExternalUser externalUser) {
    return  getaway.post("http://localhost:8080/registration",externalUser);
    }
}
