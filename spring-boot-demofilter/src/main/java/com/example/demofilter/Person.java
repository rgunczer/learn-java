package com.example.demofilter;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {

    private int id;
    private String name;

    public String getName() {
        return name + "AAA";
    }

}
