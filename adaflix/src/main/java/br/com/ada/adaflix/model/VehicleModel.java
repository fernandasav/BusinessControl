package br.com.ada.adaflix.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;
@Entity
public class VehicleModel {
    @Id
    @GeneratedValue
    private UUID Id;
    private String description;
    private String type;
    @Column(unique = true)
    private String licensePlate;
    private String brand;
    private String manufactureYear;
    private String modelYear;
    private LocalDate buyDate;
    private Boolean expiredIpva;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }

    public Boolean getExpiredIpva() {
        return expiredIpva;
    }

    public void setExpiredIpva(Boolean expiredIpva) {
        this.expiredIpva = expiredIpva;
    }
}
