package br.com.ada.adaflix.service;

import br.com.ada.adaflix.model.AdressModel;
import br.com.ada.adaflix.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class AdressService {

    @Autowired
    private AdressRepository adressRepository;

    public AdressModel save(AdressModel adressModel) {
        return adressRepository.save(adressModel);
    }

    public List<AdressModel> list() {
        return (List<AdressModel>) adressRepository.findAll();
    }

    public AdressModel searchForId(UUID id) {
        return adressRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public String delete(UUID id) {
        AdressModel adressModel = adressRepository.findById(id).orElseThrow(IllegalArgumentException::new);

        if(adressModel != null) {
            adressRepository.delete(adressModel);
        }

        return "Adress: " + adressModel.getStreet() + ", " + adressModel.getState() +  ", Zip Code: "
                + adressModel.getZipCode() + ", successfully deleted!";
    }
}
