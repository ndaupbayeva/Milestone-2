package kz.aitu.demo.repositories;

import kz.aitu.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoryInterface extends JpaRepository<Employee, Integer> {

}
