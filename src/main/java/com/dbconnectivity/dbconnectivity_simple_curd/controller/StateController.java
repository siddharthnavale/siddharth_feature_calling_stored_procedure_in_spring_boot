package com.dbconnectivity.dbconnectivity_simple_curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbconnectivity.dbconnectivity_simple_curd.Dto.SuccessObject;
import com.dbconnectivity.dbconnectivity_simple_curd.service.StateService;

@RestController
@RequestMapping("/api")
public class StateController {
	
	@Autowired
	private StateService stateService;
	
	@PostMapping("/state")
	public ResponseEntity<?> addState(@RequestParam("state") String stateName){
		String message = stateService.addState(stateName);
		return  ResponseEntity.ok(message);
		
	}
	
	@GetMapping("/countOfTeacher")
	public ResponseEntity<?> countOfTeacherForState(@RequestParam ("state") String stateName){
		
		int countOfTeacherForState = stateService.countOfTeacherForState(stateName);
		String message = "Teacher available for "+stateName+" : "+ countOfTeacherForState;
		return  ResponseEntity.ok(message);
		
	}
	
	@GetMapping("/getAllStates")
	public ResponseEntity<?> getAllStates(){
		List<String>states=stateService.getAllStates();
		return new ResponseEntity<>(new SuccessObject("Succcefully Fetched",states),HttpStatus.OK);
		}

}
