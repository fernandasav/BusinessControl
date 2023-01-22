package br.com.ada.adaflix.repository;

import br.com.ada.adaflix.model.ClientModel;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ClientRepository extends CrudRepository<ClientModel, UUID> {
}
