package com.engenheironet.projetoweb.controller;

import com.engenheironet.projetoweb.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/")
    public User user() {
        User user = new User();
        user.setId(1L);
        user.setName("Carlos");
        user.setUsername("carlosroberto");
        return user;
    }

    @PostMapping("/")
    public User user(@RequestBody User user) {
        return user;
    }
}
