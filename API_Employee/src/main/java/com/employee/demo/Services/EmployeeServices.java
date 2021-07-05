package com.employee.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.demo.Entity.EmployeeEntity;
import com.employee.demo.Repository.EmployeeRepository;

@Service
public class EmployeeServices implements BaseServices<EmployeeEntity, Long> {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public List<EmployeeEntity> findAll() {
	
		return employeeRepository.findAll();
	}

	@Override
	public Optional<EmployeeEntity> findById(Long id) {
		
		return employeeRepository.findById(id);
	}

	@Override
	public void insert(EmployeeEntity t) {
	
		
	}

	@Override
	public void update(EmployeeEntity t) {

		
	}

	@Override
	public void save(EmployeeEntity t) {
		employeeRepository.save(t);
		
	}

	@Override
	public void delete(EmployeeEntity t) {
		employeeRepository.delete(t);
		
	}

}
