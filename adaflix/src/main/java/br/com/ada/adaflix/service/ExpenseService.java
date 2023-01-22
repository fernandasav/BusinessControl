package br.com.ada.adaflix.service;

import br.com.ada.adaflix.model.ExpenseModel;
import br.com.ada.adaflix.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public ExpenseModel save(ExpenseModel expenseModel) {
        return expenseRepository.save(expenseModel);
    }

    public List<ExpenseModel> list() {
        return (List<ExpenseModel>) expenseRepository.findAll();
    }

    public ExpenseModel findById(UUID id) {
        return expenseRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }
    public String delete(UUID id) {
        ExpenseModel expenseModel = expenseRepository.findById(id).orElseThrow(IllegalArgumentException::new);

        if(expenseModel != null) {
            expenseRepository.delete(expenseModel);
        }

        return "Expense: " + expenseModel.getCategory() + ", code: " + expenseModel.getNumberNF() + ", successfully deleted!";
    }

}
