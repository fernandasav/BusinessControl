package br.com.ada.adaflix.repository;

import br.com.ada.adaflix.model.VehicleModel;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface VehicleRepository extends CrudRepository <VehicleModel, UUID> {
}
