package com.dbconnectivity.dbconnectivity_simple_curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbconnectivity.dbconnectivity_simple_curd.Dto.ResponceDto;

import com.dbconnectivity.dbconnectivity_simple_curd.service.StateTeacherService;

@RestController
@RequestMapping("/api")
public class StateTeacherController {
	
	@Autowired
	private StateTeacherService stateTeacherService;
	
	@GetMapping("/stateTeachers")
	public ResponseEntity<?> getStateTeachers(){
		List<ResponceDto> response = stateTeacherService.getStateTeachers();
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}

}
