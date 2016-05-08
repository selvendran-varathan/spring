package com.cyntax.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cyntax.model.Activity;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {
	
	/* (non-Javadoc)
	 * @see com.cyntax.service.ExerciseService#findAllActivities()
	 */
	public List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		return activities;
	}
	

}
