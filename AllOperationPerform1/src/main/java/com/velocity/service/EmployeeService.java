package com.velocity.service;

import java.util.List;

import com.velocity.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployee(Integer id);

	public void deleteEmployee(Integer id);

	public List<Employee> findByUserList(String city);
}
