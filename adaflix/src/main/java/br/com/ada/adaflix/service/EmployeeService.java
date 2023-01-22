package br.com.ada.adaflix.service;

import br.com.ada.adaflix.model.EmployeeModel;
import br.com.ada.adaflix.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeModel save(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }

    public List< EmployeeModel> list() {
        return (List<EmployeeModel>) employeeRepository.findAll();
    }

    public EmployeeModel searchForId(UUID id) {
        return employeeRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }
    public String delete(UUID id) {
        EmployeeModel employeeModel = employeeRepository.findById(id).orElseThrow(IllegalArgumentException::new);

        if(employeeModel != null) {
            employeeRepository.delete(employeeModel);
        }

        return "Employee: " + employeeModel.getName() + ", CPF: " + employeeModel.getCpf() + ", successfully deleted!";
    }

}
