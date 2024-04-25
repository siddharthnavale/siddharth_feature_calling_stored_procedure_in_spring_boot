package com.dbconnectivity.dbconnectivity_simple_curd.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dbconnectivity.dbconnectivity_simple_curd.model.State;



@Repository
public interface StateRepository extends JpaRepository<State, Integer>{

//use @Procedure name as method name
	@Procedure
	Integer get_count_of_teacher_in_particular_state(String state);
	
	@Procedure 
	List<String> get_all_state();
	
//use @Procedure with different method name, use attribute to pass procedure name
	@Procedure(procedureName = "get_count_of_teacher_in_particular_state")
	Integer getCountOfTeacherStateWise(String state);
	
	@Procedure(procedureName = "get_all_state")
	List<String> getStates();
	
//Use @NamedStoredProcedureQuery annotation annotation on entity class(for that only we query in entity class)
	
	@Procedure(name = "get_teacher_count_by_state")
	Integer getCountByState(@Param("state") String state);
	
	@Procedure(name = "getAllState")
	List<String> getAllState();
	
//using @Query, @Query is work with Stored Procedure are taking input no output
	
	@Query(value = "call get_all_state()",nativeQuery = true)
	List<String> getAllStateUsingQueryAnnotation();
	
	
	
	
	
	
}
