package br.com.ada.adaflix.controller;

import br.com.ada.adaflix.model.AdressModel;
import br.com.ada.adaflix.service.AdressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/adress")
public class AdressController {

    private final AdressService adressService;

    public AdressController(AdressService adressService) {
        this.adressService = adressService;
    }

    @PostMapping
    public AdressModel save(@RequestBody AdressModel adressModel) {
        return adressService.save(adressModel);
    }

    @GetMapping
    public List<AdressModel> list() {
        return adressService.list();
    }

    @GetMapping("/{id}")
    public AdressModel searchForId(@PathVariable UUID id) {
            return adressService.searchForId(id);
        }

    @DeleteMapping("/delete/{id}")
    public String deleteAdress (@PathVariable UUID id) {
        return adressService.delete(id);
    }

}


