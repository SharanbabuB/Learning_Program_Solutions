package com.cognizant.orm_query_methods_demo;

import com.cognizant.orm_query_methods_demo.model.Country;
import com.cognizant.orm_query_methods_demo.repository.CountryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmQueryMethodsDemoApplication {

	private static CountryRepository countryRepository;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmQueryMethodsDemoApplication.class, args);
		countryRepository = context.getBean(CountryRepository.class);

		testFindByNameContaining();
		testFindByNameContainingOrderByNameAsc();
		testFindByNameStartingWith();
	}

	static void testFindByNameContaining() {
		List<Country> list = countryRepository.findByNameContaining("ou");
		list.forEach(c -> System.out.println("Found (contains 'ou'): " + c.getName()));
	}

	static void testFindByNameContainingOrderByNameAsc() {
		List<Country> list = countryRepository.findByNameContainingOrderByNameAsc("ou");
		list.forEach(c -> System.out.println("Sorted Asc (contains 'ou'): " + c.getName()));
	}

	static void testFindByNameStartingWith() {
		List<Country> list = countryRepository.findByNameStartingWith("Z");
		list.forEach(c -> System.out.println("Starts with Z: " + c.getName()));
	}
}
