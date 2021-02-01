package com.example.gestion.emplye.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.gestion.emplye.model.Employe;

@Repository
public interface EmployeeRepository extends  CrudRepository<Employe, Long> {

}
