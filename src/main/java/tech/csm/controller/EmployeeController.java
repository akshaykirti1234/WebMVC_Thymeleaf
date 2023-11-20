package tech.csm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import tech.csm.model.Employee;
import tech.csm.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;

	// 1.Display Register Page
	@GetMapping("/register")
	public String showRegisterPage(@ModelAttribute Employee employee) {
		return "EmployeeRegister";
	}

	// 2. Read Form data and insert in DB
	@PostMapping("/saveEmp")
	public String saveEmp(@ModelAttribute Employee employee, RedirectAttributes attributes) {
		Integer id = employeeService.saveEmployee(employee);
		attributes.addFlashAttribute("msg", "Register Successfull with id " + id);
		return "redirect:./register";
	}

	// 3. get all rows and display in Html
	@GetMapping("/showAllEmp")
	public String showAllEmp(Model model) {
		List<Employee> empList = employeeService.getAllEmployees();
		model.addAttribute("empList", empList);
		return "EmployeeDetails";
	}

	// 4. Delete based on Id
	@GetMapping("/delete")
	public String delete(@RequestParam Integer empId, RedirectAttributes redirectAttributes) {
		employeeService.deleteEmployee(empId);
		return "redirect:./showAllEmp";

	}

	// 5.Show data in edit page
	@GetMapping("/edit")
	public String edit(@RequestParam Integer empId, RedirectAttributes redirectAttributes) {
		Employee employee = employeeService.getOneEmployee(empId);
		redirectAttributes.addFlashAttribute("employee", employee);
		return "redirect:./register";
	}

}
