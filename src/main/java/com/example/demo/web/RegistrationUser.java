package com.example.demo.web;

import com.example.demo.entity.ExternalUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yulo0717 on 8/9/2017.
 */
@RestController
public class RegistrationUser {




    @PostMapping("/registration")
    public void registration(@RequestBody ExternalUser user){


    }
}
