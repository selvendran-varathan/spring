package com.cyntax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cyntax.model.Activity;
import com.cyntax.model.Exercise;
import com.cyntax.service.ExerciseService;

@Controller
public class MinutesController {
	
	@Autowired
	private ExerciseService exerciseService;
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise){
		System.out.println("addMinutes:"+exercise.getMinutes());
		return "addMinutes";
	}
	
	@RequestMapping(value="/activities",method=RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities(){
		return exerciseService.findAllActivities() ;
	}
//	@RequestMapping(value="/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise){
//		System.out.println("addMoreMinutes:"+exercise.getMinutes());
//		return "addMinutes";
//	}

}
