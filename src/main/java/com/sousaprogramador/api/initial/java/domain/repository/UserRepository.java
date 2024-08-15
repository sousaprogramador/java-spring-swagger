package com.sousaprogramador.api.initial.java.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sousaprogramador.api.initial.java.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);
}
