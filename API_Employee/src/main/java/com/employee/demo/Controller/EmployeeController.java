package com.employee.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.Entity.EmployeeEntity;
import com.employee.demo.Exception.EmployeeException;
import com.employee.demo.Services.EmployeeServices;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeServices employeeServices;
	
	@GetMapping("/")
	public List<EmployeeEntity> findAllEmps()
	{
		return employeeServices.findAll();
	}
	
	@GetMapping("/{id}")
	public EmployeeEntity getEmp(@PathVariable Long id)
	{
		return employeeServices.findById(id).orElseThrow(() -> new EmployeeException(id));
	}
	
	@PostMapping("/")
	public void insert(@RequestBody EmployeeEntity employee)
	{
		employeeServices.insert(employee);
	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable Long id , @RequestBody EmployeeEntity employee)
	{
		employeeServices.findById(id).orElseThrow(() -> new EmployeeException(id));
		employeeServices.save(employee);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@RequestBody EmployeeEntity employee)
	{
		employeeServices.delete(employee);
	}
}
