package com.example.demo.entity;

import com.example.demo.entity.additions.Characteristic;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
public class ExternalUser {
   private String name;
   private List<Characteristic> characteristics;

   public ExternalUser(){};

}
