package ro.developmentfactory.myspringapi.Company;


import javax.persistence.*;

@Entity
@Table(name = "Company")

public class Company {


    @Id
    @SequenceGenerator(
            name = "company_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "company_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;

    private String company;


    public Company() { }

    public Company(String company) {
        this.company = company;
    }


    public Long getId(){
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
