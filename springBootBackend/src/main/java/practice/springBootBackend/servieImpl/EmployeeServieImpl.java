package practice.springBootBackend.servieImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import practice.springBootBackend.entity.Employee;
import practice.springBootBackend.exception.ResourceNotFound;
import practice.springBootBackend.repository.EmployeeRepository;
import practice.springBootBackend.service.EmployeeService;

@Service
public class EmployeeServieImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;

	public EmployeeServieImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll() ;
	}

	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent()){
			return employee.get();
		}else {
			throw new ResourceNotFound("Employee","id",id);
		}
}

	
}
