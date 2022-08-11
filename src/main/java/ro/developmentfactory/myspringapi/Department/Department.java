package ro.developmentfactory.myspringapi.Department;


import ro.developmentfactory.myspringapi.Company.Company;

import javax.persistence.*;

@Entity
@Table(name = "Department")

public class Department {


    @Id
    @SequenceGenerator(
            name = "department_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "department_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;



    @ManyToOne
    @JoinColumn(name = "COMPANY_ID", referencedColumnName = "ID")
    private Company company;
    private String department;

    public Department() { }

    public Department(Company company, String department) {
        this.department = department;
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
