package com.examen.App.web3.controller;

import com.examen.App.web3.model.User;
import com.examen.App.web3.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = {"http://localhost:3000", "https://prod--dabanao.netlify.app"})

public class userController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody Map<String, String> credentials) {
        String email = credentials.get("email");
        String password = credentials.get("password");

        User user = userService.login(email, password);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User newUser) {
        User user = userService.register(newUser);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/api/logout")
    public ResponseEntity<String> logout(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return ResponseEntity.ok("Logout successful");
    }

    @GetMapping("/all")
    public List<User> findAllUser(){
        return  userService.allUser();
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id ){
        userService.deleteUser(id);
    }
    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Integer id){
        return userService.findById(id);
    }
    @PutMapping("/{id}")
    public User UpdateUser(@PathVariable Integer id , @RequestBody User user){
        return  userService.updateUser(id,user);
    }
}
