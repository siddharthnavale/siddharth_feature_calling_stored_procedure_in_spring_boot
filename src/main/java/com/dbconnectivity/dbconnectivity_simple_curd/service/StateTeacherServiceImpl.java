package com.dbconnectivity.dbconnectivity_simple_curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbconnectivity.dbconnectivity_simple_curd.Dto.ResponceDto;
import com.dbconnectivity.dbconnectivity_simple_curd.repo.TeacherStateRepository;

@Service
public class StateTeacherServiceImpl implements StateTeacherService{

	@Autowired
	private TeacherStateRepository teacherStateRepository;
	
	@Override
	public List<ResponceDto> getStateTeachers() {
		// 
		return teacherStateRepository.getTeachersTeachesInParticularState(ResponceDto.class);
	}

	
}
