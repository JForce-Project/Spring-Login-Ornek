package com.metin.spring.security.and.jwt.repository;

import com.metin.spring.security.and.jwt.model.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends JpaRepository<Long, Personal> {
    Personal findByUserName(String userName);
}
