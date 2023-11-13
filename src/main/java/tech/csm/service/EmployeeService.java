package tech.csm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tech.csm.model.Employee;
import tech.csm.repo.EmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService {

	private EmployeeRepo employeeRepo;

	@Override
	public Integer saveEmployee(Employee e) {
		e = employeeRepo.save(e);
		return e.getEmpId();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		return employeeRepo.findById(id).get();
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepo.deleteById(id);
	}

	@Override
	public void updateEmployee(Employee e) {
		employeeRepo.save(e);
	}

}
