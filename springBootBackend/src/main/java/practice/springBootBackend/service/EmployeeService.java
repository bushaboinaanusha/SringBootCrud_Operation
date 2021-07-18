package practice.springBootBackend.service;

import java.util.List;

import practice.springBootBackend.entity.Employee;

public interface EmployeeService {
Employee saveEmployee(Employee employee);
 List<Employee> getAllEmployees();
 Employee getEmployeeById(long id);

}
