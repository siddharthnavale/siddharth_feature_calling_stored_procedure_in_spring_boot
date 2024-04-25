package com.dbconnectivity.dbconnectivity_simple_curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbconnectivity.dbconnectivity_simple_curd.model.State;
import com.dbconnectivity.dbconnectivity_simple_curd.repo.StateRepository;

@Service
public class StateServiceImpl implements StateService{

	@Autowired
	private StateRepository stateRepository;
	
	
	@Override
	public String addState(String stateName) {
	
		State state	=new State();
		state.setStateName(stateName);
		stateRepository.save(state);
		return "State Added Successfully";
	}


	@Override
	@Transactional
	public int countOfTeacherForState(String stateName) {
		
		//Integer get_count_of_teacher_in_particular_state = stateRepository.get_count_of_teacher_in_particular_state(stateName);
		//Integer count = stateRepository.getCountOfTeacherStateWise(stateName);
		Integer count = stateRepository.getCountByState(stateName);
		return count;
	}


	@Override
	@Transactional
	public List<String> getAllStates() {

		//List<String> states = stateRepository.get_all_state();
		//List<String> states = stateRepository.getStates();
		//List<String> states = stateRepository.getAllState();
		List<String> states = stateRepository.getAllStateUsingQueryAnnotation();
		return states;
	}

}
