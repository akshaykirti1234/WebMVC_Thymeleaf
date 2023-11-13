package tech.csm.service;

import java.util.List;

import tech.csm.model.Employee;

public interface IEmployeeService {

	Integer saveEmployee(Employee e);

	List<Employee> getAllEmployees();

	Employee getOneEmployee(Integer id);

	void deleteEmployee(Integer id);

	void updateEmployee(Employee e);

}
