package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Skill1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Skill1.class);

    private int id;
    private String name;

    public Skill1() {
        LOGGER.debug("Inside Skill1 Constructor");
    }

    public int getId() {
        LOGGER.debug("Getting Skill Id: {}", id);
        return id;
    }

    public void setId(int id) {
        LOGGER.debug("Setting Skill Id: {}", id);
        this.id = id;
    }

    public String getName() {
        LOGGER.debug("Getting Skill Name: {}", name);
        return name;
    }

    public void setName(String name) {
        LOGGER.debug("Setting Skill Name: {}", name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Skill1 [id=" + id + ", name=" + name + "]";
    }
}
