package com.gustavo.webservice.config;

import com.gustavo.webservice.entities.User;
import com.gustavo.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Gustavo", "gustavo@gmail.com", "77 9 8851-4780", "Simula14417");
        User user2 = new User(null, "Elizania", "lisa@gmail.com", "77 9 8166-2197", "gkac212007");
        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
