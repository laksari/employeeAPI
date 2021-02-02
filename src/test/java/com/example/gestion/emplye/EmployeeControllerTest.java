package com.example.gestion.emplye;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.gestion.emplye.controller.EmployeeController;
import com.example.gestion.emplye.service.EmployeeService;

@WebMvcTest(controllers = EmployeeController.class)
public class EmployeeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeController employeeController;
	
	@Test
	public void testEmployee() throws Exception {
		
		mockMvc.perform(get("/employees")).andExpect(status().isOk());
	}
	
	@Test
	public void testInstance() {
		assertThat(employeeController).isNotNull();
		assertThat(employeeController.getEmployeeService()).isNotNull();
	}

}
