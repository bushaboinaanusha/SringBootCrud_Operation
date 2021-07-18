package practice.springBootBackend.controller;

import java.net.http.HttpRequest;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import practice.springBootBackend.entity.Employee;
import practice.springBootBackend.service.EmployeeService;

@RestController
//internally calls @Controller,@ResponseBody
@RequestMapping("/api/employee")
public class EmployeeController {
	EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	// create Rest API or insert an employee
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
		
	}
	//get All Employees REST API
	@GetMapping
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployees() ;
		
	}
	//get Employee by ID REST API
	@GetMapping("{id}")
	public  ResponseEntity<Employee> getEmployeeById(@PathVariable("id")long employeeId){
		return new  ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),(HttpStatus.OK));
		
	}

}
