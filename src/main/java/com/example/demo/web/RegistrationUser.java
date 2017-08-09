package com.example.demo.web;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
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
    private UserRepository userRepository;



    @PostMapping("/registration")
    public void registration(@RequestBody User user){
           userRepository.save(user);

    }
}
