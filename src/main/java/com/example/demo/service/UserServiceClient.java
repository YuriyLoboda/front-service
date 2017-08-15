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
        List<String> nonUpdatedCharacteristic = getNonUpdatedCharacteristics();
        List<Characteristic> c = externalUser.getCharacteristics();

        externalUser.setCharacteristics(updateListOfCharacteristicsThatWillBeChange(nonUpdatedCharacteristic,c));
    return  getaway.post("http://localhost:8080/registration",externalUser);
    }

    private List<Characteristic> updateListOfCharacteristicsThatWillBeChange(List<String> nonUpdatedCharacteristic, List<Characteristic> allUsersCharacteristics) {
        for (int i = 0; i < nonUpdatedCharacteristic.size(); i++) {
            for (int j = 0; j < allUsersCharacteristics.size(); j++) {
                if (allUsersCharacteristics.get(j).getName().equals(nonUpdatedCharacteristic.get(i))) {
                    allUsersCharacteristics.remove(j);
                }
            }
        }
        return allUsersCharacteristics;
    }
    private List<String> getNonUpdatedCharacteristics() {
        List<String> characteristics = new ArrayList<>();
        characteristics.add("Cars");
        characteristics.add("Surname");
        return characteristics;
    }
}
