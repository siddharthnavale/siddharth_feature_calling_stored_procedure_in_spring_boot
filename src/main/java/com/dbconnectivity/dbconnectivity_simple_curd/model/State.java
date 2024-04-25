package com.dbconnectivity.dbconnectivity_simple_curd.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@NamedStoredProcedureQuery(
		name="getAllState",
		procedureName = "get_all_state"
		)
@NamedStoredProcedureQuery(
		name = "get_teacher_count_by_state",
		procedureName = "get_count_of_teacher_in_particular_state",
		parameters = {
				     @StoredProcedureParameter(mode=ParameterMode.IN, name="state",type = String.class),
				     @StoredProcedureParameter(mode=ParameterMode.OUT, name="total",type = Integer.class)
		             }
		)
public class State {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="State_Id")
	private Integer stateId;

	private String stateName;
	
	@OneToMany(mappedBy = "StateId")
	List<Teacher_state> teacherstate= new ArrayList<>();
	
	
	
}
