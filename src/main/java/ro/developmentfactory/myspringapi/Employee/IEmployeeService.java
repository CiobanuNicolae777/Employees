package ro.developmentfactory.myspringapi.Employee;

import ro.developmentfactory.myspringapi.Employee.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmployees();
    void createEmployee(Employee employee);
    void updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}
