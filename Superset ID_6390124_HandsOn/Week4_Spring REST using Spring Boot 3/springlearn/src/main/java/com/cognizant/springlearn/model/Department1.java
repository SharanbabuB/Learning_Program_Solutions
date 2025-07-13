package com.cognizant.springlearn.model;

public class Department1 {
    private int id;
    private String name;

    public Department1() {
    }

    public Department1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department1 [id=" + id + ", name=" + name + "]";
    }
}
