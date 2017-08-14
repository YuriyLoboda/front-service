package com.example.demo.entity.additions;

import lombok.*;

import java.util.List;

/**
 * Created by yulo0717 on 8/11/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Characteristic {

    String name;
    List<String> values;
}
