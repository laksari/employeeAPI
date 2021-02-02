package com.example.gestion.emplye.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion.emplye.model.Employe;
import com.example.gestion.emplye.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	

	public EmployeeService getEmployeeService() {
		return employeeService;
	}


	@GetMapping("/employees")
	public Iterable<Employe> getEmployees() {
		return employeeService.getEmployees();
	}
	
	
	@GetMapping("/employees/{id}")
	public Optional<Employe> getEmploye(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}
	
	@PostMapping("/newEmployee")
	public void addEmployee(@RequestBody Employe employee) {
		employeeService.saveEmployee(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
	}
	
	@PutMapping("/updateEmployee")
	public Employe updateEmployee(@RequestBody Employe employee) {
		return employeeService.saveEmployee(employee);
	}

}
