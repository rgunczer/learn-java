package com.flanker.mssqltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/gender")
public class MyRestController {

    @Autowired
    GenderRepository genderRepository;

    @GetMapping("")
    public Iterable<Gender> test() {
        return genderRepository.findAll();
    }
}
