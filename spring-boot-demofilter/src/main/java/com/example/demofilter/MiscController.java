package com.example.demofilter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiscController {

    @GetMapping("/hell")
    public String getHell() {
        return "HELL";
    }

    @GetMapping("/branches/somecompany/WS/categories")
    public String getCors() {
        Person p = new Person();
        p.setId(1);
        p.setName("Jancsi");

        return "{ \"data\": \"" + p.getName() + "\" }";
    }

}
