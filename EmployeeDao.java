package com.employee.dao;

import java.util.List;

import com.employee.entity.Employee;


public interface EmployeeDao {
   
	public List<Employee> listEmployee();	
    
	public void addEmployee(Employee employee);
    
    public void editEmployee(Employee employee);
    
    public void deleteEmployee(Employee employee);

}
