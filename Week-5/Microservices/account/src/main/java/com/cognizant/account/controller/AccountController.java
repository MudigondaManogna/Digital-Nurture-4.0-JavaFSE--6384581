package com.cognizant.account.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    // GET /accounts/{number} -> Return mock account details
    @GetMapping("/{number}")
    public ResponseEntity<Map<String, Object>> getAccount(@PathVariable String number) {
        Map<String, Object> account = new LinkedHashMap<>();
        account.put("number", number);
        account.put("type", "savings");
        account.put("balance", 234343);
        return ResponseEntity.ok(account);
    }

    // Optional: GET /accounts -> Welcome message
    @GetMapping
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome to the Account Service");
    }
}
