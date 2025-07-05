package com.cognizant.orm_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.orm_learn.service.CountryService2;
import com.cognizant.orm_learn.model.Country2;

@SpringBootApplication
public class OrmLearnApplication2 {

    private static CountryService2 countryService2;

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication2.class, args);
        countryService2 = context.getBean(CountryService2.class);

        testFindCountryByCode();
    }

    private static void testFindCountryByCode() throws Exception {
        System.out.println("Finding country with code IN...");
        Country2 country = countryService2.findCountryByCode("IN");
        System.out.println("Result: " + country);
    }
}
