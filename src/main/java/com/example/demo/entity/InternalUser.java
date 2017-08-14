package com.example.demo.entity;

import com.example.demo.entity.additions.Characteristic;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by yulo0717 on 8/10/2017.
 */
@Data
@Getter
@Setter
public class InternalUser {

    private String id;
    private String name;
    private String surname;
    private int age;
    private String firm;
    private List<Characteristic> characteristic;

    public InternalUser(){};
}
