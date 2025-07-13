package com.cognizant.spring_learn.Exercise2;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exercise2Runner {
    private static final Logger LOGGER = LoggerFactory.getLogger(Exercise2Runner.class);

    public static void main(String[] args) {
        LOGGER.debug("START - Exercise 2");

        // Load Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        // Get the list of countries
        @SuppressWarnings("unchecked")
        List<Country> countryList = (List<Country>) context.getBean("countryList");

        // Print all countries
        for (Country country : countryList) {
            System.out.println("Country: " + country);
        }

        LOGGER.debug("END - Exercise 2");
    }
}
