package tech.csm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.csm.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
