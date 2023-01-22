package br.com.ada.adaflix.repository;

import br.com.ada.adaflix.model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EmployeeRepository extends CrudRepository<EmployeeModel, UUID> {
}
