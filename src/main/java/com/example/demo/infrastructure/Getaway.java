package com.example.demo.infrastructure;

import com.example.demo.entity.ExternalUser;
import com.example.demo.entity.InternalUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yulo0717 on 8/10/2017.
 */
@Component
public class Getaway {
    @Autowired
    private RestTemplate restTemplate;

    public InternalUser post(String url , ExternalUser externalUser){
     return    restTemplate.postForEntity(url,externalUser, InternalUser.class).getBody();
    }

}
