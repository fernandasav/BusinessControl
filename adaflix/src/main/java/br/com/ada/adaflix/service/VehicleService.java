package br.com.ada.adaflix.service;

import br.com.ada.adaflix.model.VehicleModel;
import br.com.ada.adaflix.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public VehicleModel save(VehicleModel vehicleModel) {
        return vehicleRepository.save(vehicleModel);
    }

    public List<VehicleModel> list() {
        return (List<VehicleModel>) vehicleRepository.findAll();
    }
    public VehicleModel searchForId(UUID id) {
        return vehicleRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }
    public List<VehicleModel> searchForYear(String year) {
        Iterable<VehicleModel> vehicleList = vehicleRepository.findAll();
        List<VehicleModel> vehicles = new ArrayList<>();
        vehicleList.forEach(vehicleModel -> {
            if (vehicleModel.getManufactureYear().equals(year)
                    || vehicleModel.getModelYear().equals(year)) {
                vehicles.add(vehicleModel);
            }
        });
        return vehicles;
    }

    public String delete(UUID id) {
        VehicleModel vehicleModel = vehicleRepository.findById(id).orElseThrow(IllegalArgumentException::new);

        if(vehicleModel != null) {
            vehicleRepository.delete(vehicleModel);
        }

        return "Vehicle: " + vehicleModel.getBrand() + ", license plate: " + vehicleModel.getLicensePlate()
                + ", successfully deleted!";
    }
}
