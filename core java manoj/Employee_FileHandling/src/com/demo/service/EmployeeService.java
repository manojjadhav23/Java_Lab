package com.demo.service;

import java.util.List;

import com.demo.Exception.EmployeeNotFound;
import com.demo.beans.Employee;

public interface EmployeeService {

	void ReadFile(String string);

	boolean AddNewEmployee();

	List<Employee> FindAll();

	void WriteFile(String string);

	boolean DeleteEmployee(int id) throws EmployeeNotFound;

	boolean UpdateEmployee(int id, double salary) throws EmployeeNotFound;

}
