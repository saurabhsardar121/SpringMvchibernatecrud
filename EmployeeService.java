package com.employee.Service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {
	
public List<Employee> listEmployee();	
    
	public void addEmployee(Employee employee);
    
    public void editEmployee(Employee employee);
    
    public void deleteEmployee(Employee employee);

}
