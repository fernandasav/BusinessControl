package br.com.ada.adaflix.controller;

import br.com.ada.adaflix.model.EmployeeModel;
import br.com.ada.adaflix.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public EmployeeModel save(@RequestBody EmployeeModel employeeModel) {
        return employeeService.save(employeeModel);
    }

    @GetMapping
    public List< EmployeeModel > list() {
        return employeeService.list();
    }

    @GetMapping("/{id}")
    public EmployeeModel searchForId(@PathVariable UUID id) {
        return employeeService.searchForId(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployees (@PathVariable UUID id) {
        return employeeService.delete(id);
    }
}