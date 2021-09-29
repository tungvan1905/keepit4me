package com.vti.service;

import java.util.List;
import com.vti.entity.DetailGoal;

public interface DetailGoalService {
	
	   Iterable<DetailGoal> findAll();

	    List<DetailGoal> search(String term);

	    DetailGoal findOne(Integer id);

	    void delete(Integer id);

		void save(DetailGoal detailGoal);

}
