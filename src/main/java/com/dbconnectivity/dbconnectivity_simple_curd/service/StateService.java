package com.dbconnectivity.dbconnectivity_simple_curd.service;

import java.util.List;

public interface StateService {

	String addState(String stateName);

	int countOfTeacherForState(String stateName);

	List<String> getAllStates();

}
