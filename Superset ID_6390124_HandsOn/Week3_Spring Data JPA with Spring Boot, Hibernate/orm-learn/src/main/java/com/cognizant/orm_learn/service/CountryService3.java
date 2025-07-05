package com.cognizant.orm_learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import com.cognizant.orm_learn.model.Country3;
import com.cognizant.orm_learn.repository.CountryRepository3;

@Service
public class CountryService3 {

    @Autowired
    private CountryRepository3 countryRepository3;

    @Transactional
    public void addCountry(Country3 country) {
        countryRepository3.save(country);
    }
}
