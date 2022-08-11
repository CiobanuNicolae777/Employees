package ro.developmentfactory.myspringapi.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> getDepartment();

    void createDepartment(Department department);

    void updateDepartment(Long id, Department department);

    void deleteDepartment(Long id);
}
