package br.com.ada.adaflix.controller;

import br.com.ada.adaflix.model.VehicleModel;
import br.com.ada.adaflix.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping
    public VehicleModel save(@RequestBody VehicleModel vehicleModel) {
        return vehicleService.save(vehicleModel);
    }

    @GetMapping
    public List <VehicleModel> list() {
        return vehicleService.list();
    }

    @GetMapping("/{id}")
    public VehicleModel searchForId(@PathVariable UUID id) {
        return vehicleService.searchForId(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteVehicle (@PathVariable UUID id) {
        return vehicleService.delete(id);
    }
}
