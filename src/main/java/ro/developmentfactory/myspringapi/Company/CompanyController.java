package ro.developmentfactory.myspringapi.Company;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/api/v1/company")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<Company> getCompany(){
        return companyService.getCompany();
    }

    @PostMapping
    public void createCompany(@RequestBody Company company){
        companyService.createCompany(company);
    }

    @PutMapping(path = "{id}")
    public void updateCompany(@PathVariable Long id, @RequestBody Company company){
        companyService.updateCompany(id, company);
    }
    @DeleteMapping(path = "{id}")
    public void deleteCompany(@PathVariable Long id){
        companyService.deleteCompany(id);
    }
}
