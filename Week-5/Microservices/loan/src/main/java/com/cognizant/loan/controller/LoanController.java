package com.cognizant.loan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public ResponseEntity<Map<String, Object>> getLoanDetails(@PathVariable String number) {
        Map<String, Object> loan = new LinkedHashMap<>();
        loan.put("number", "H00987987972342");
        loan.put("type", "car");
        loan.put("loan", 400000);
        loan.put("emi", 3258);
        loan.put("tenure", 18);
        return ResponseEntity.ok(loan);
    }
}
