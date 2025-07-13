package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.Base64;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        // Decode Basic Auth header
        String[] parts = authHeader.split(" ");
        if (parts.length != 2 || !parts[0].equalsIgnoreCase("Basic")) {
            throw new RuntimeException("Invalid Authorization header");
        }

        String decoded = new String(Base64.getDecoder().decode(parts[1]));
        String[] userParts = decoded.split(":", 2);
        String username = userParts[0];
        String password = userParts[1];

        // Validate (hardcoded for example)
        if (!username.equals("user") || !password.equals("pwd")) {
            throw new RuntimeException("Invalid credentials");
        }

        // Generate fake JWT
        String token = generateFakeJwt(username);

        return Map.of("token", token);
    }

    private String generateFakeJwt(String username) {
        // This is just an example. You would use a real JWT library.
        return Base64.getEncoder().encodeToString(("jwt-for-" + username).getBytes());
    }
}
