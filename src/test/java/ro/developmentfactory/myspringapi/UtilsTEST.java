package ro.developmentfactory.myspringapi;

import com.github.javafaker.Faker;
import ro.developmentfactory.myspringapi.Company.Company;
import ro.developmentfactory.myspringapi.Department.Department;
import ro.developmentfactory.myspringapi.Employee.Employee;

public class UtilsTEST {
    private static final Faker FAKER = new Faker();

    public static Company createCompany() {
        Company company = new Company();
        company.setCompany(FAKER.company().name());
        return company;
    }

    public static Department createDepartment(){
        Department department = new Department();
        department.setDepartment(FAKER.company().name());
        return department;
    }

    public static Employee createEmployee() {
        Employee employee = new Employee();
        employee.setFirstName(FAKER.company().name());
        employee.setLastName(FAKER.company().name());
        employee.setAge(FAKER.hashCode());
        employee.setEmailAddress(FAKER.company().name());
        employee.setPhoneNumber(FAKER.company().name());
        employee.setAddress(FAKER.company().name());
        employee.setJob(FAKER.company().name());
        employee.setSalary(FAKER.hashCode());
        return employee;
    }
}
