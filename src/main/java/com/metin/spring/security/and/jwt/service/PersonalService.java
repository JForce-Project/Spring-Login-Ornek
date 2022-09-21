package com.metin.spring.security.and.jwt.service;

import com.metin.spring.security.and.jwt.model.Personal;

public interface PersonalService {
    Personal findByUserName(String userName);
}
