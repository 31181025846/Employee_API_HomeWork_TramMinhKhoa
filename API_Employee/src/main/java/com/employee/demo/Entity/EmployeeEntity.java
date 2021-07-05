package com.employee.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "full_name", length = 50, nullable = false)
	private String fullname;
	@Column(name = "address", length = 100, nullable = false)
	private String address;

	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(Long id, String fullname, String address) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return this.getId() + "," + this.getFullname() + "," + this.getAddress();
	}

}
