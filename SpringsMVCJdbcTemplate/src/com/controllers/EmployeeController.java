package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mnp.dto.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmpService empService;

	// method when customer clicks on "Add emp" link and show form using
	// showAddEmp.jsp
	@RequestMapping("/showAddEmp")
	public ModelAndView showAddEmp() {
		Employee employee = new Employee();
		return new ModelAndView("showAddEmp", "command", employee);
	}

	// method when customer clicks on "Add emp" button
	@RequestMapping(value = "/AddEmp", method = RequestMethod.POST)
	public ModelAndView addEmp(@ModelAttribute("employee") Employee employee, BindingResult result) {
		empService.saveEmployee(employee);
		return new ModelAndView("showEmp", "emp", employee);
	}

	@RequestMapping("/getAllEmps")
	public ModelAndView getAllEmps() {
		List<Employee> emps = empService.getAllEmployees();
		return new ModelAndView("showEmps", "emps", emps);
	}

	// method when customer clicks on "delete user" link
	@RequestMapping("/showDeleteEmp")
	public String showDeleteEmp() throws Exception {
		return "deleteUser";
	}

	// method when customer clicks on "serach user" link
	@RequestMapping("/showGetEmpById")
	public String showGetEmp() throws Exception {
		return "readUser";
	}

	// method when customer clicks on "search user" button
	@RequestMapping("/getEmpById")
	public ModelAndView getEmpById(@RequestParam("id") int empId) throws Exception {
		Employee emp = empService.getEmpById(empId);
		return new ModelAndView("showEmp", "emp", emp);
	}

	// method when customer clicks on "delete user" button
	@RequestMapping("/deleteEmp")
	public ModelAndView deleteEmp(@RequestParam("id") int userId) throws Exception {
		Employee emp = new Employee();
		emp.setId(userId);

		boolean result = empService.deleteEmployee(emp);
		if (!result) {
			return new ModelAndView("deleteUser", "messageInfo", "Data not  found");

		}
		return new ModelAndView("deleteUser", "messageInfo", "Deleted successfully");
	}

	// method when customer clicks on "serach user" link
	@RequestMapping("/showGetEmpsByName")
	public String showGetEmps() throws Exception {
		return "readUser1";
	}

	// method when customer clicks on "search user" button
	@RequestMapping("/getEmpByName")
	public ModelAndView getEmpByName(@RequestParam("name") String empName) {
		Employee emp = empService.getEmpByName(empName);
		return new ModelAndView("showEmp", "emp", emp);
	}

	// --------------------------------------------------------------------------------------
	// method when customer clicks on "delete user" link
	@RequestMapping("/showDeleteEmpByName")
	public String showDeleteEmpByName() throws Exception {
		return "deleteUser1";
	}

	@RequestMapping("/showDeleteEmpByName1")
	public ModelAndView showDeleteEmpByName(@RequestParam("name") String userName) throws Exception {
		Employee emp = new Employee();
		emp.setName(userName);

		boolean result = empService.deleteEmployeeByName(emp);
		if (!result) {
			return new ModelAndView("deleteUser1", "messageInfo", "Data not  found");

		}
		return new ModelAndView("deleteUser1", "messageInfo", "Deleted successfully");
	}
}
