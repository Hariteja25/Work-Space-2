package com.mythri.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mythri.dto.Employee;
import com.mythri.dto.EmployeeResponse;
import com.mythri.dto.Info;
import com.mythri.exception.UserException;
import com.mythri.service.EmployeeService;

@Controller
@RequestMapping("/rest")
public class RestController {

	@Autowired
	private EmployeeService employeeService;

	// URL: <BASE_URL>/rest/employees
	// http method : GET
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public @ResponseBody EmployeeResponse getEmps() {
		EmployeeResponse empResponse = new EmployeeResponse();
		empResponse.setStatus("SUCESSS");
		List<Employee> employees = employeeService.getEmployees1();
		empResponse.setEmployees(employees);
		return empResponse;
	}

	@RequestMapping(value = "/getEmpByIdParam", method = RequestMethod.GET)
	public @ResponseBody EmployeeResponse getEmpByIdParam(@RequestParam("id") int id) {
		EmployeeResponse empResponse = new EmployeeResponse();

		// get employee by id
		Employee empById = employeeService.getEmpById(id);
		if (empById == null) {
			empResponse.setStatus("Employee id " + id + " not found");
			return empResponse;
		}

		empResponse.setStatus("SUCESSS");
		empResponse.getEmployees().add(empById);

		return empResponse;
	}

	@RequestMapping(value = "/getEmpByIdPathParam/{id}", method = RequestMethod.GET)
	public @ResponseBody EmployeeResponse getEmpByIdPathParam(@PathVariable("id") int id) {
		EmployeeResponse empResponse = new EmployeeResponse();
		Employee empById = employeeService.getEmpById(id);
		if (empById == null) {
			empResponse.setStatus("Employee id " + id + " not found");
			return empResponse;
		}
		empResponse.setStatus("SUCESSS");
		empResponse.getEmployees().add(empById);

		return empResponse;
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Info deleteEmpById(@PathVariable("id") int id) {
		Info info = new Info();

		Employee empById = employeeService.getEmpById(id);
		// code for employee not found
		if (empById == null) {
			info.setStatus("Employee id " + id + " not found");
			return info;
		}

		// code for employee found, call the delete employee
		Employee e = new Employee();
		e.setId(id);
		employeeService.deleteEmployee(e);

		info.setStatus("Employee " + id + " Deleted.");

		return info;
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public @ResponseBody Info createEmployee(@RequestBody Employee emp) {

		Info info = new Info();

		try {
			employeeService.addEmployee(emp);
		} catch (UserException e) {
			String msg = e.getMessage();
			info.setStatus(msg);
			return info;
		}
		info.setStatus("Employee Created!");

		return info;

	}

	@RequestMapping(value = "/employee", method = RequestMethod.PUT)
	public @ResponseBody Info updateEmployee(@RequestBody Employee emp) {
		Info info = new Info();

		// validate the id
		Integer id = emp.getId();
		Employee empById = employeeService.getEmpById(id);
		if (empById == null) {
			info.setStatus("Employee id " + id + " not found");
			return info;
		}

		// update the employee
		try {
			employeeService.updateEmployee(emp);
		} catch (UserException e) {
			String msg = e.getMessage();
			info.setStatus(msg);
			return info;
		}

		info.setStatus("Employee upated!");
		return info;
	}

}
