package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by yulo0717 on 8/9/2017.
 */
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Document(collection="registered_users")
public class User {

    @Id
    private String id;
    private String last_name;
    private String first_name;
    private int age;
    private String firm;

    public User(){};

}
