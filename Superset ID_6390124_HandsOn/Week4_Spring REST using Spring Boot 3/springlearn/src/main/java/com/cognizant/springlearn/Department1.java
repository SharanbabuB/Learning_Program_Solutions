package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Department1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Department1.class);

    private int id;
    private String name;

    public Department1() {
        LOGGER.debug("Inside Department1 Constructor");
    }

    public int getId() {
        LOGGER.debug("Getting Department Id: {}", id);
        return id;
    }

    public void setId(int id) {
        LOGGER.debug("Setting Department Id: {}", id);
        this.id = id;
    }

    public String getName() {
        LOGGER.debug("Getting Department Name: {}", name);
        return name;
    }

    public void setName(String name) {
        LOGGER.debug("Setting Department Name: {}", name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department1 [id=" + id + ", name=" + name + "]";
    }
}
