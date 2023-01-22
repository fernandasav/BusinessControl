package br.com.ada.adaflix.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.*;
@Entity
public class ExpenseModel {
    @Id
    @GeneratedValue
    private UUID Id;
    private String provider;
    private String category;
    @Column(unique = true)
    private String numberNF;
    private Double valueNF;
    private LocalDate dueDate;
    private Boolean isPaid;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNumberNF() {
        return numberNF;
    }

    public void setNumberNF(String numberNF) {
        this.numberNF = numberNF;
    }

    public Double getValueNF() {
        return valueNF;
    }

    public void setValueNF(Double valueNF) {
        this.valueNF = valueNF;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }
}
