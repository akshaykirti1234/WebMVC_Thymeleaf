package tech.csm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tech.csm.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	private IEmployeeService employeeService;

	// 1.Display Register Page
	@GetMapping("/register")
	public String showRegisterPage() {
		return "EmployeeRegister";
	}

	// 2. Read Form data and insert inn DB

	// 3. get all rows amd display in html

	// 4. Delete based on Id

	// 5.Show data in edit page

	// 6.Update on Edit Form submit
}
