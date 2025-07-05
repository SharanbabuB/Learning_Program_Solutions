package com.cognizant.orm_query_methods_demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    private double salary;

    private boolean permanent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dp_id")
    private Department2 department;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "employee_skill2", joinColumns = @JoinColumn(name = "es_em_id"), inverseJoinColumns = @JoinColumn(name = "es_sk_id"))
    private List<Skill2> skillList;
}
