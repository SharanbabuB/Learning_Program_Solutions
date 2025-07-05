package com.cognizant.orm_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.orm_learn.model.Country3;
import com.cognizant.orm_learn.service.CountryService3;

@SpringBootApplication
public class OrmLearnApplication3 {

    private static CountryService3 countryService3;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication3.class, args);
        countryService3 = context.getBean(CountryService3.class);

        testAddCountry();
    }

    private static void testAddCountry() {
        Country3 country = new Country3();
        country.setCode("SG");
        country.setName("Singapore");
        countryService3.addCountry(country);
        System.out.println("New country added: " + country);
    }
}
