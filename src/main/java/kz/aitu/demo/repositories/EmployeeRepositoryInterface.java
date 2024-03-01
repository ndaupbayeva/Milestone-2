package kz.aitu.demo.repositories;

import kz.aitu.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepositoryInterface extends JpaRepository<Employee, Integer> {
}
interface OrderServiceInterface extends JpaRepository<Employee, Integer> {

}
