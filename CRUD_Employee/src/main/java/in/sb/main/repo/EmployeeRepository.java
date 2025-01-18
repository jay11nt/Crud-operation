package in.sb.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sb.main.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long > 
{

}
