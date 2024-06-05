package com.examen.App.web3.repository;

import com.examen.App.web3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
