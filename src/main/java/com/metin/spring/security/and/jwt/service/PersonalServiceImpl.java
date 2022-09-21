package com.metin.spring.security.and.jwt.service;

import com.metin.spring.security.and.jwt.model.Personal;
import com.metin.spring.security.and.jwt.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalServiceImpl implements PersonalService {

    @Autowired
    PersonalRepository personalRepository;


    @Override
    public Personal findByUserName(String userName) {
        return personalRepository.findByUserName(userName);
    }
}
