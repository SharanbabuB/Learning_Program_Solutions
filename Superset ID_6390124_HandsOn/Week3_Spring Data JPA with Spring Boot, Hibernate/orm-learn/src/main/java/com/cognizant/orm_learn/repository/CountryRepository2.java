package com.cognizant.orm_learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.orm_learn.model.Country2;

@Repository
public interface CountryRepository2 extends JpaRepository<Country2, String> {
    // JpaRepository provides findById(String code) by default
}
