package ro.developmentfactory.myspringapi.Department;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentService implements IDepartmentService {


    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<Department> getDepartment() {
        return (List<Department>) departmentRepository.findAll();
    }

    @Override
    public void createDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void updateDepartment(Long id, Department department) {
        Department departmentToUpdate  = departmentRepository.findById(id).orElseThrow(
                () -> new IllegalStateException(String.format("Department with id %s doesn't exist", id)));


        departmentToUpdate.setDepartment(department.getDepartment());
        departmentToUpdate.setCompany(department.getCompany());


        departmentRepository.save(departmentToUpdate);
    }


    public void deleteDepartment(Long id){
        boolean departmentExists = departmentRepository.existsById(id);
        if(!departmentExists){
            throw new IllegalStateException(String.format("Department with id %s does not exist", id));
        }
        departmentRepository.deleteById(id);
    }
}
