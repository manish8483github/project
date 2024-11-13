package com.velocity.servicempl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.Repository.EmployeeRepository;
import com.velocity.UserException.UserNotFoundException;
import com.velocity.model.Employee;
import com.velocity.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {

		Employee emp = employeeRepository.save(employee);
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee empUp = employeeRepository.save(employee);
		return empUp;
	}

	@Override
	public Employee getEmployee(Integer id) {

		Employee empGet = employeeRepository.findById(id);
		if (empGet == null) {
			throw new UserNotFoundException("id is not found");
		}
		return empGet;
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);

	}

	@Override
	public List<Employee> findByUserList(String city) {
		List<Employee> list1 = employeeRepository.findByCity(city);
		return list1;
	}
}
