package br.com.ada.adaflix.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class EmployeeModel {
    @Id
    @GeneratedValue
    private UUID Id;
    private String name;
    private String telephone;
    @Column(unique = true)
    private String cpf;
    private String email;
    private LocalDate hiringDate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adress_id")
    private AdressModel adressModel;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    public AdressModel getAdressModel() {
        return adressModel;
    }

    public void setAdressModel(AdressModel adressModel) {
        this.adressModel = adressModel;
    }
}
