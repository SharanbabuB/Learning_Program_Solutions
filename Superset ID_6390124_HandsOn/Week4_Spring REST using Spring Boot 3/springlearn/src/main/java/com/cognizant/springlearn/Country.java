package com.cognizant.springlearn;

public class Country {
    private String code;
    private String name;

    public Country() {
        System.out.println("Inside Country Constructor.");
    }

    public String getCode() {
        System.out.println("Getting Country Code: " + code);
        return code;
    }

    public void setCode(String code) {
        System.out.println("Setting Country Code: " + code);
        this.code = code;
    }

    public String getName() {
        System.out.println("Getting Country Name: " + name);
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting Country Name: " + name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [code=" + getCode() + ", name=" + getName() + "]";
    }
}
