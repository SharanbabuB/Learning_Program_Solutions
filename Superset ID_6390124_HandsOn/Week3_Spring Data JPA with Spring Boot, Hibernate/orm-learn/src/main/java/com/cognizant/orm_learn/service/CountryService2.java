package com.cognizant.orm_learn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import com.cognizant.orm_learn.model.Country2;
import com.cognizant.orm_learn.repository.CountryRepository2;

@Service
public class CountryService2 {

    @Autowired
    private CountryRepository2 countryRepository2;

    @Transactional
    public Country2 findCountryByCode(String code) throws Exception {
        Optional<Country2> result = countryRepository2.findById(code);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new Exception("Country with code " + code + " not found.");
        }
    }
}
