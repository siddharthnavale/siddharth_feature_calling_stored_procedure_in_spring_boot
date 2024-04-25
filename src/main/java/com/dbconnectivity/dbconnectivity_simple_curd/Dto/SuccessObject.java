package com.dbconnectivity.dbconnectivity_simple_curd.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessObject {
	
	private String message;
	
	private Object data;

}
