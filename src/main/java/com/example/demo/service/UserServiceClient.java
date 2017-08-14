package com.example.demo.service;

import com.example.demo.entity.ExternalUser;
import com.example.demo.entity.InternalUser;
import com.example.demo.entity.additions.Characteristic;
import com.example.demo.infrastructure.Getaway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceClient {


@Autowired
    private Getaway getaway;

    public InternalUser createUser(ExternalUser externalUser) {
        List<String> l = new ArrayList<>();
        l.add("age");
        l.add("Cars");
        List<Characteristic> c = externalUser.getCharacteristics();
       for (int i = 0;i<l.size();i++){
           for (int j=0;j<c.size();j++){
               if(c.get(j).getName().equals(l.get(i))){
                   c.remove(j);
               }
           }
       }
        externalUser.setCharacteristics(c);
    return  getaway.post("http://localhost:8080/registration",externalUser);
    }
}
