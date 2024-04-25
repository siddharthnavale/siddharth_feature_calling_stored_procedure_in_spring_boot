package com.dbconnectivity.dbconnectivity_simple_curd.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dbconnectivity.dbconnectivity_simple_curd.Dto.ResponceDto;
import com.dbconnectivity.dbconnectivity_simple_curd.model.Teacher_state;


@Repository
public interface TeacherStateRepository extends JpaRepository<Teacher_state, Integer> {

	@Query(value = "call TeachersTeachesInParticularState()",nativeQuery = true)
	List<ResponceDto> getTeachersTeachesInParticularState(Class<ResponceDto> class1);
}

