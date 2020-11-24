package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENTS")
public class Department {
	
	@Id
	@Column(name = "DEPARTMENT_ID")
	@GeneratedValue
	private Integer departmentId;
	
	@Column(name = "DEPARTMENT_NAME")
	private String departmentName;
	
	@Column(name = "MANAGER_ID")
	private Integer managerId;
	
	@ManyToOne
	@JoinColumn(name="LOCATION_ID")
	private Location location;

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
