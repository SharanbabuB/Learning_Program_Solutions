package com.cognizant.orm_learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.orm_learn.model.Country3;

@Repository
public interface CountryRepository3 extends JpaRepository<Country3, String> {
}
