package ro.developmentfactory.myspringapi.Company;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService implements ICompanyService {


    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getCompany() {
        return (List<Company>) companyRepository.findAll();
    }

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public void updateCompany(Long id, Company company) {
        Company companyToUpdate  = companyRepository.findById(id).orElseThrow(
                () -> new IllegalStateException(String.format("Company with id %s doesn't exist", id)));


        companyToUpdate.setCompany(company.getCompany());


        companyRepository.save(companyToUpdate);
    }


    public void deleteCompany(Long id){
        boolean companyExists = companyRepository.existsById(id);
        if(!companyExists){
            throw new IllegalStateException(String.format("Company with id %s does not exist", id));
        }
        companyRepository.deleteById(id);
    }
}
