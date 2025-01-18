package in.sb.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.sb.main.entity.Employee;
import in.sb.main.repo.EmployeeRepository;



@Controller
@RequestMapping("/employee")
public class MyController 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@ResponseBody
	@PostMapping//("/employee")
	public Employee addperson(@RequestBody Employee employee) 
	{
		
		return employeeRepository.save(employee);
	}
	
	@ResponseBody
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
	}
	
	@ResponseBody
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable  Long id)
	{
		return employeeRepository.findById(id);
	}
	
}
