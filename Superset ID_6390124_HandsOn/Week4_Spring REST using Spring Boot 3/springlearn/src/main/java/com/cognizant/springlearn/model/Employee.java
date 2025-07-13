package com.cognizant.springlearn.model;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String permanent;
    private String department;

    public Employee() {
        System.out.println("Inside Employee Constructor.");
    }

    // Getters & Setters with logs
    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Setting ID: " + id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting Name: " + name);
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        System.out.println("Setting Salary: " + salary);
        this.salary = salary;
    }

    public String getPermanent() {
        return permanent;
    }

    public void setPermanent(String permanent) {
        System.out.println("Setting Permanent: " + permanent);
        this.permanent = permanent;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        System.out.println("Setting Department: " + department);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
                + ", department=" + department + "]";
    }
}
