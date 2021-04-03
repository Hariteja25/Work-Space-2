package com.mythri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mythri.dao.EmployeeDao;
import com.mythri.dto.Employee;
import com.mythri.dto.EmployeeListResponse;
import com.mythri.exception.UserException;
import com.mythri.util.ErrorEnum;

@Service("employeeService")
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	// This method is used for Registration and AddEmp scenarios.
	@Transactional
	public void addEmployee(Employee employee) throws UserException {
		if (employeeDao.isEmployeeExists(employee.getLoginName()))throw new UserException(ErrorEnum.ERRO4.getErrorCode(), ErrorEnum.ERRO4.getMsg());
		employeeDao.saveEmployee(employee);
	}

	@Transactional
	public Employee getValidEmpByAuth(Employee employee) {
		return employeeDao.getValidEmpByAuth(employee);
	}

	@Transactional
	public Employee getEmpByName(String name) {
		return employeeDao.searchByName(name);
	}
	
	
	
	//-------------------------------------------------------------------------------------------------------------------------
	
	
 
    @Transactional
	public Employee getValidemp(String pass1, Integer id) {
		return employeeDao.getValidemp(pass1,id);
	}
    
    @Transactional
	public int updatepswd(String pass2,Integer id) {
		return employeeDao.updatepswd(pass2,id);

	}
	
	//-------------------------------------------------------------------------------------------------------------------------

	@Transactional
	public List<Employee> getEmployees(Integer id) {
		return employeeDao.getAllEmployees(id);
	}
	
	@Transactional
	public List<Employee> getEmployees1() {
		return employeeDao.getAllEmployees1();
	}
	

	@Transactional
	public Employee getEmpById(int id) {
		return employeeDao.getEmpById(id);
	}

	@Transactional
	public boolean deleteEmployee(Employee employee) {
		// check if the employee exists
		Employee empById = employeeDao.getEmpById(employee.getId());

		// if the employee doesnt exists then dont make db call, just return false;
		if (empById == null) {
			return false;
		}
		return employeeDao.deleteEmployee(employee);
	}

	@Transactional
	public void updateEmployee(Employee employee) throws UserException {
		employeeDao.updateEmployee(employee);

	}
	
	


	
	public EmployeeListResponse listEmployeess(int pageId) {
		return employeeDao.listEmployeess(pageId);
	}
	
	
	
//--------------------------------------------------------------------------------------------
	
	
	
	
	@Transactional
	public void updateMyEmployee(Employee employee,Integer id) throws UserException {
		employeeDao.updateMyEmployee(employee,id);

	}
}

// -----------------------------------------------------------------------------




