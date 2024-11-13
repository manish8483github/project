package com.velocity.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.velocity.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {
	public Employee findById(Integer id);

	@Query(value = "select * from employee e where city=?1", nativeQuery = true) 
	public List<Employee> findByCity(String city);

}
