package ro.developmentfactory.myspringapi.Employee;

import org.springframework.data.repository.CrudRepository;
import ro.developmentfactory.myspringapi.Employee.Employee;

import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Optional<Employee> getEmployeeByEmailAddress(String emailAddress);

    Optional<Employee> getEmployeeByPhoneNumber(String number);
}
