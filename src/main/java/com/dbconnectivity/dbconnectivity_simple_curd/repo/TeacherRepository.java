package com.dbconnectivity.dbconnectivity_simple_curd.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbconnectivity.dbconnectivity_simple_curd.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

}

