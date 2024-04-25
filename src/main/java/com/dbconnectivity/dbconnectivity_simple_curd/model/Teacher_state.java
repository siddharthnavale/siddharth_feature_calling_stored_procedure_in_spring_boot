package com.dbconnectivity.dbconnectivity_simple_curd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Teacher_state {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Teacher_State_Id")
	private Integer teacherStateId;
	
	@ManyToOne
	@JoinColumn(name = "State_Id")
	private State StateId; 
	
	@ManyToOne
	@JoinColumn(name = "Teacher_Id")
	private Teacher TeacherId;
	

}
