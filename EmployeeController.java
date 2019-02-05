package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.employee.Service.EmployeeService;
import com.employee.entity.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/allemployee")
	public ModelAndView showallemployee() {
	
	List<Employee> list1=	employeeService.listEmployee();
	System.out.println(list1);
		return new ModelAndView("list","employees",list1);
	}
	
	@RequestMapping("/add")
	public ModelAndView redirectdemployee(@ModelAttribute Employee employee) {
		
	return new ModelAndView("add");
	}
	
	@RequestMapping("/addredirect")
	public String addemployee(@ModelAttribute Employee employee) {
	
	employeeService.addEmployee(employee);
	
	return "redirect:allemployee.html";
	}
	
	
	@RequestMapping("/edit")
	public ModelAndView redirectemployee(Long id , String name , String address, Long salary) {
	Employee employee = new Employee();
	employee.setId(id);
	employee.setName(name);
	employee.setAddress(address);
	employee.setSalary(salary);
	
		return new ModelAndView("edit","employee", employee);
	}
	
	
	@RequestMapping("/editrediect")
	public String editemployee(@ModelAttribute Employee employee) {
	         
		employeeService.editEmployee(employee);
	
		return "redirect:allemployee.html";
	}
	
	@RequestMapping("/delete")
	public String deleteemployee(@ModelAttribute Employee employee) {
	
	    employeeService.deleteEmployee(employee);
	
	    return "redirect:allemployee.html";
	}
	
	
	
	
}
