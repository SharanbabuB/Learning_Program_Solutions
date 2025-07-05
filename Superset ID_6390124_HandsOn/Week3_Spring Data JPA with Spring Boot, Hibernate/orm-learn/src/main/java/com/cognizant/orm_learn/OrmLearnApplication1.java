package com.cognizant.orm_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.model.Country1;
import com.cognizant.orm_learn.service.CountryService1;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication1 {

    private static CountryService1 countryService1;

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication1.class, args);
        countryService1 = context.getBean(CountryService1.class);

        testGetAllCountries();
        testFindCountryByCode();
        testAddCountry();
        testUpdateCountry();
        testDeleteCountry();
    }

    private static void testGetAllCountries() {
        System.out.println("All countries:");
        List<Country1> countries = countryService1.getAllCountries();
        countries.forEach(System.out::println);
    }

    private static void testFindCountryByCode() throws Exception {
        System.out.println("Find country with code IN:");
        System.out.println(countryService1.findCountryByCode("IN"));
    }

    private static void testAddCountry() {
        Country1 newCountry = new Country1();
        newCountry.setCode("JP");
        newCountry.setName("Japan");
        countryService1.addCountry(newCountry);
        System.out.println("Added country: " + newCountry);
    }

    private static void testUpdateCountry() throws Exception {
        Country1 update = new Country1();
        update.setCode("JP");
        update.setName("Japan Updated");
        countryService1.updateCountry(update);
        System.out.println("Updated country: " + update);
    }

    private static void testDeleteCountry() throws Exception {
        countryService1.deleteCountry("JP");
        System.out.println("Deleted country with code JP");
    }
}
