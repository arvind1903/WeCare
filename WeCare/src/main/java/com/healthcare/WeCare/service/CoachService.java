package com.healthcare.WeCare.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.WeCare.DTO.CoachDTO;
import com.healthcare.WeCare.entity.Coach;
import com.healthcare.WeCare.repository.CoachRepository;

@Service
public class CoachService {

	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private CoachRepository repository;
	
	public String createCoach(CoachDTO coachdto) {
		
		Coach coach = new Coach();
		mapper.map(coachdto, coach);
		
		Coach ch =repository.saveAndFlush(coach);
		
		return ch.getCoachID().toString();
	}

}
