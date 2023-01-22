package br.com.ada.adaflix.repository;

import br.com.ada.adaflix.model.ExpenseModel;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;
public interface ExpenseRepository extends CrudRepository<ExpenseModel, UUID> {
}
