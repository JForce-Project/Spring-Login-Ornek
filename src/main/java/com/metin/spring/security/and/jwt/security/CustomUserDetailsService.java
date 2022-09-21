package com.metin.spring.security.and.jwt.security;

import com.metin.spring.security.and.jwt.model.Personal;
import com.metin.spring.security.and.jwt.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    PersonalService personalService;

    @Autowired
    private DummyUserService dummyUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Personal personal=personalService.findByUserName(username);

        User user=null;

        if(personal!=null){
            user=new User(personal.getUsername(), personal.getPassword(), new ArrayList<>());
        }

        return user;
    }
}
