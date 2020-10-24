package com.mylearning.SpringSecurityDemo.service;

import java.util.List;

import com.mylearning.SpringSecurityDemo.domain.User;
import com.mylearning.SpringSecurityDemo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private UserRepository userRepo;

    @Secured({ "ROLE_ADMIN", "ROLE_SUPERUSER" })
    public List<User> getAllUserAccounts() {
        return userRepo.findAll();
    }

}
