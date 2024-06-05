package com.examen.App.web3.service;

import com.examen.App.web3.model.User;
import com.examen.App.web3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User login(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return user;
        }
        return null;
    }

    public User register(User newUser) {
        if (userRepository.findByEmail(newUser.getEmail()) != null) {
            return null;
        }
        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
        return userRepository.save(newUser);
    }
    public List<User> allUser(){
     return  userRepository.findAll();
    }
    public  void deleteUser(UUID id){
        userRepository.deleteById(id);
    }
    public Optional<User> findById(UUID id){
        return userRepository.findById(id);
    }
}
