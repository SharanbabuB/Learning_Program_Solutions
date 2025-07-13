package com.cognizant.springlearn;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Employee2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Employee2.class);

    private int id;
    private String name;
    private double salary;
    private boolean permanent;
    private Date dateOfBirth;
    private Department1 department;
    private List<Skill1> skillList;

    public Employee2() {
        LOGGER.debug("Inside Employee2 Constructor");
    }

    public int getId() {
        LOGGER.debug("Getting Id: {}", id);
        return id;
    }

    public void setId(int id) {
        LOGGER.debug("Setting Id: {}", id);
        this.id = id;
    }

    public String getName() {
        LOGGER.debug("Getting Name: {}", name);
        return name;
    }

    public void setName(String name) {
        LOGGER.debug("Setting Name: {}", name);
        this.name = name;
    }

    public double getSalary() {
        LOGGER.debug("Getting Salary: {}", salary);
        return salary;
    }

    public void setSalary(double salary) {
        LOGGER.debug("Setting Salary: {}", salary);
        this.salary = salary;
    }

    public boolean isPermanent() {
        LOGGER.debug("Getting Permanent: {}", permanent);
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        LOGGER.debug("Setting Permanent: {}", permanent);
        this.permanent = permanent;
    }

    public Date getDateOfBirth() {
        LOGGER.debug("Getting DOB: {}", dateOfBirth);
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        LOGGER.debug("Setting DOB: {}", dateOfBirth);
        this.dateOfBirth = dateOfBirth;
    }

    public Department1 getDepartment() {
        LOGGER.debug("Getting Department: {}", department);
        return department;
    }

    public void setDepartment(Department1 department) {
        LOGGER.debug("Setting Department: {}", department);
        this.department = department;
    }

    public List<Skill1> getSkillList() {
        LOGGER.debug("Getting Skill List: {}", skillList);
        return skillList;
    }

    public void setSkillList(List<Skill1> skillList) {
        LOGGER.debug("Setting Skill List: {}", skillList);
        this.skillList = skillList;
    }

    @Override
    public String toString() {
        return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary +
                ", permanent=" + permanent + ", dateOfBirth=" + dateOfBirth +
                ", department=" + department + ", skillList=" + skillList + "]";
    }
}
