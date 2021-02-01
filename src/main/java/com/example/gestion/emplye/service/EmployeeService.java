package com.example.gestion.emplye.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestion.emplye.model.Employe;
import com.example.gestion.emplye.repository.EmployeeRepository;

import lombok.Data;

@Data
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Optional<Employe> getEmployee(final Long id) {
		return employeeRepository.findById(id);
	}

	public Iterable<Employe> getEmployees() {
		return employeeRepository.findAll();
	}

	public void deleteEmployee(final Long id) {
		employeeRepository.deleteById(id);
	}

	public Employe saveEmployee(Employe employe) {
		Employe savedEmployee = employeeRepository.save(employe);
		return savedEmployee;
	}

}
