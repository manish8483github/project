package com.velocity.Restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Employee;
import com.velocity.service.EmployeeService;

@RestController
public class EmployeeRestontroller {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		Employee emp2 = employeeService.saveEmployee(employee);
		return emp2;
	}

	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		Employee emp3 = employeeService.updateEmployee(employee);

		return emp3;

	}

	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable("id") Integer id) {
		Employee emp4 = employeeService.getEmployee(id);

		return emp4;
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable("id") Integer id) {
		employeeService.deleteEmployee(id);
	}

	@GetMapping("/findbyuserlist/{id}")
	public List<Employee> findByUserList(@PathVariable("id") String city) {
		List<Employee> list2 = employeeService.findByUserList(city);
		return list2;
	}

}