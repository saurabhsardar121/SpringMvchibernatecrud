package com.employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public List<Employee> listEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.listEmployee();
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.addEmployee(employee);
	}

	@Override
	public void editEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.editEmployee(employee);

	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(employee);
	}

}
