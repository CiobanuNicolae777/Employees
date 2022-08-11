package ro.developmentfactory.myspringapi.Company;

import java.util.List;

public interface ICompanyService {
    List<Company> getCompany();

    void createCompany(Company company);

    void updateCompany(Long id, Company company);

    void deleteCompany(Long id);
}
