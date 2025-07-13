package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.Exercise2.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    public Country getCountry(String code) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Country.xml");
        List<Country> countryList = (List<Country>) context.getBean("countryList");

        // Using Lambda to find match ignoring case
        return countryList.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
