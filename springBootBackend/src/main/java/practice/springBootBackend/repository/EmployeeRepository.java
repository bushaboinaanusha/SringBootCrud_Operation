package practice.springBootBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import practice.springBootBackend.entity.Employee;
//@Repository
//@Transactional,internally implements

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
