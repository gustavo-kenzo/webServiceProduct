package com.gustavo.webservice.resources;

import com.gustavo.webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "gustavo", "gustavo@gmail.com", "988514780", "12345");
        return ResponseEntity.ok().body(user);
    }
}
