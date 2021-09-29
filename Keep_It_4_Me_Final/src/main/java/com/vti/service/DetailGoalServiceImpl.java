package com.vti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.DetailGoal;
import com.vti.repository.DetailGoalRepository;

import java.util.List;

@Service
public class DetailGoalServiceImpl implements DetailGoalService {

    @Autowired
    private DetailGoalRepository detailGoalRepository;

    
    @Override
    public Iterable<DetailGoal> findAll() {
        return detailGoalRepository.findAll();
    }

    @Override
    public List<DetailGoal> search(String term) {
        return detailGoalRepository.findBynameDetailContaining(term);
    }

    @Override
    public DetailGoal findOne(Integer id) {
        return detailGoalRepository.findOne(id);
    }

    @Override
    public void save(DetailGoal detailGoal) {
    	detailGoalRepository.save(detailGoal);
    }

    @Override
    public void delete(Integer id) {
    	detailGoalRepository.delete(id);
    }
}

