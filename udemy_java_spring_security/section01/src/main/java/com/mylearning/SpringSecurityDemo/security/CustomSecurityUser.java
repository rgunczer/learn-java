package com.mylearning.SpringSecurityDemo.security;

import com.mylearning.SpringSecurityDemo.domain.User;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomSecurityUser extends User implements UserDetails {

    private static final long serialVersionUID = 7781823216242383668L;
    
    public CustomSecurityUser() {}
    
    public CustomSecurityUser(User user) {
        this.setAuthorities(user.getAuthorities());
        this.setId(user.getId());
        this.setUsername(user.getUsername());
        this.setPassword(user.getPassword());
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    
}
