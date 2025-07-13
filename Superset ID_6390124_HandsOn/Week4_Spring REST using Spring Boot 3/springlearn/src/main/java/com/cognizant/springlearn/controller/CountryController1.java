package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country2;
import com.cognizant.springlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController1.class);

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country2 getCountry(@PathVariable String code) {
        LOGGER.info("START - getCountry()");
        Country2 country = countryService.getCountry(code);
        LOGGER.info("END - getCountry()");
        return country;
    }
}
