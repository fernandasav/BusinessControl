package br.com.ada.adaflix.controller;

import br.com.ada.adaflix.model.ExpenseModel;
import br.com.ada.adaflix.service.ExpenseService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public ExpenseModel save(@RequestBody ExpenseModel expenseModel) {
        return expenseService.save(expenseModel);
    }

    @GetMapping
    public List<ExpenseModel> list() {
        return expenseService.list();
    }

    @GetMapping("/{id}")
    public ExpenseModel searchForId(@PathVariable UUID id) {
        return expenseService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteExpenses (@PathVariable UUID id) {
        return expenseService.delete(id);
    }
}
