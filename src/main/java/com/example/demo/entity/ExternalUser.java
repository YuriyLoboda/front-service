package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class ExternalUser {

   private String first_name;
   private  String last_name;
   private int age;

   public ExternalUser(){};

}
