package com.cognizant.orm_learn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import com.cognizant.orm_learn.model.Country1;
import com.cognizant.orm_learn.repository.CountryRepository1;

@Service
public class CountryService1 {

    @Autowired
    private CountryRepository1 countryRepository1;

    @Transactional
    public List<Country1> getAllCountries() {
        return countryRepository1.findAll();
    }

    @Transactional
    public Country1 findCountryByCode(String code) throws Exception {
        Optional<Country1> result = countryRepository1.findById(code);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new Exception("Country not found");
        }
    }

    @Transactional
    public void addCountry(Country1 country) {
        countryRepository1.save(country);
    }

    @Transactional
    public void updateCountry(Country1 country) throws Exception {
        if (countryRepository1.existsById(country.getCode())) {
            countryRepository1.save(country);
        } else {
            throw new Exception("Country not found for update");
        }
    }

    @Transactional
    public void deleteCountry(String code) throws Exception {
        if (countryRepository1.existsById(code)) {
            countryRepository1.deleteById(code);
        } else {
            throw new Exception("Country not found for delete");
        }
    }
}
