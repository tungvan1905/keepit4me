package com.vti.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vti.entity.DetailGoal;

import java.util.List;

@Repository
public interface DetailGoalRepository extends CrudRepository<DetailGoal, Integer> {

    List<DetailGoal> findBynameDetailContaining(String term);

	DetailGoal findOne(Integer id);

	void delete(Integer id);

}
