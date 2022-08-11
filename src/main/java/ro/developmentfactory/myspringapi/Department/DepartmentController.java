package ro.developmentfactory.myspringapi.Department;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Department> getDepartment(){
        return departmentService.getDepartment();
    }

    @PostMapping
    public void createDepartment(@RequestBody Department department){
        departmentService.createDepartment(department);
    }

    @PutMapping(path = "{id}")
    public void updateDepartment(@PathVariable Long id, @RequestBody Department department){
        departmentService.updateDepartment(id, department);
    }
    @DeleteMapping(path = "{id}")
    public void deleteDepartment(@PathVariable Long id){
        departmentService.deleteDepartment(id);
    }
}
