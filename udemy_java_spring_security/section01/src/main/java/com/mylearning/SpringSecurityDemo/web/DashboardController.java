package com.mylearning.SpringSecurityDemo.web;

import java.util.List;

import com.mylearning.SpringSecurityDemo.domain.User;
import com.mylearning.SpringSecurityDemo.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/dashboard")
    public String getDashboard(@AuthenticationPrincipal User user, ModelMap model) {
        System.out.println(user);
        
        model.put("user", user);

        List<User> all = adminService.getAllUserAccounts();

        return "dashboard";
    }
    
}
