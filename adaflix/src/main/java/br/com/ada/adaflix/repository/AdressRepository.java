package br.com.ada.adaflix.repository;

import br.com.ada.adaflix.model.AdressModel;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AdressRepository extends CrudRepository<AdressModel, UUID> {
}
