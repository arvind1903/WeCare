package com.healthcare.WeCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.WeCare.DTO.CoachDTO;
import com.healthcare.WeCare.service.CoachService;

@RestController
@RequestMapping("/coaches")
public class CoachController {

	@Autowired
	private CoachService service;
	
	@GetMapping("/getdata")
	public String getCoaches() {
		return "get all coaches";
	}
	@PostMapping("/coaches")
	public ResponseEntity<String> createCoach(@RequestBody CoachDTO coachdto){
		String coachid = service.createCoach(coachdto);
		return ResponseEntity.ok().body(coachid);
	}
}
