package br.com.ada.adaflix.service;

import br.com.ada.adaflix.model.ClientModel;
import br.com.ada.adaflix.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public ClientModel save(ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }

    public List<ClientModel> list() {
        return (List<ClientModel>) clientRepository.findAll();
    }

    public ClientModel searchForId(UUID id) {
        return clientRepository.findById(id).orElse(null);
    }

    public String delete(UUID id) {
        ClientModel clientModel = clientRepository.findById(id).orElse(null);

        if (clientModel != null) {
            clientRepository.delete(clientModel);
        }
        return "Client: " + clientModel.getName() + ", CPF: " + clientModel.getCpf() + ", , successfully deleted!";

    }
}