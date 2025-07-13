package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @RequestMapping("/country")
    public Country1 getCountryIndia() {
        LOGGER.info("START - getCountryIndia()");

        Country1 country;
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country1.xml")) {
            country = context.getBean("country1", Country1.class);
        }

        LOGGER.info("END - getCountryIndia()");
        return country;
    }
}
