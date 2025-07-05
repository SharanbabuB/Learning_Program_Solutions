package com.cognizant.orm_query_methods_demo.repository;

import com.cognizant.orm_query_methods_demo.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
}
