package ro.developmentfactory.myspringapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import ro.developmentfactory.myspringapi.Company.Company;
import ro.developmentfactory.myspringapi.Company.CompanyRepository;
import ro.developmentfactory.myspringapi.Department.Department;
import ro.developmentfactory.myspringapi.Department.DepartmentRepository;
import ro.developmentfactory.myspringapi.Employee.Employee;
import ro.developmentfactory.myspringapi.Employee.EmployeeRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@Rollback(false)
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class RepositoryTEST {

    private final CompanyRepository companyRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    @Autowired
    public RepositoryTEST(CompanyRepository companyRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.companyRepository = companyRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Test
    void testSaveCompany() {
        Company company = UtilsTEST.createCompany();
        company = companyRepository.save(company);
        Company expectedCompany = companyRepository.findById(company.getId()).orElse(null);
        assertEquals(expectedCompany, company);
    }

    @Test
    void testSaveDepartment() {
        Department department = UtilsTEST.createDepartment();
        department = departmentRepository.save(department);
        Department expectedDepartment = departmentRepository.findById(department.getId()).orElse(null);
        assertEquals(expectedDepartment, department);
    }

    @Test
    void testSaveEmployee() {
        Employee employee = UtilsTEST.createEmployee();
        employee = employeeRepository.save(employee);
        Employee expectedEmployee = employeeRepository.findById(employee.getId()).orElse(null);
        assertEquals(expectedEmployee, employee);
    }
}
