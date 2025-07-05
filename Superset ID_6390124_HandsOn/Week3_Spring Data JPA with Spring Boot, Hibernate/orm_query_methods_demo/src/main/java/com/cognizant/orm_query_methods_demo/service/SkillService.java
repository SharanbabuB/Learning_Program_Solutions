package com.cognizant.orm_query_methods_demo.service;

import com.cognizant.orm_query_methods_demo.model.Skill;
import com.cognizant.orm_query_methods_demo.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    public Skill get(int id) {
        return skillRepository.findById(id).orElse(null);
    }

    public void save(Skill skill) {
        skillRepository.save(skill);
    }
}
