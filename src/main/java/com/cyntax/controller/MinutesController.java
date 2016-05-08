package com.cyntax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cyntax.model.Exercise;

@Controller
public class MinutesController {
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise){
		System.out.println("addMinutes:"+exercise.getMinutes());
		return "addMinutes";
	}
	
//	@RequestMapping(value="/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise){
//		System.out.println("addMoreMinutes:"+exercise.getMinutes());
//		return "addMinutes";
//	}

}
