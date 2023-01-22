package br.com.ada.adaflix.controller;

import br.com.ada.adaflix.model.ClientModel;
import br.com.ada.adaflix.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ClientModel save(@RequestBody ClientModel clientModel) {
        return clientService.save(clientModel);
    }

    @GetMapping
    public List<ClientModel> list() {
        return clientService.list();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> searchForId(@PathVariable UUID id) {
        if(clientService.searchForId(id) == null) {
            return new ResponseEntity<>("Client not found.", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(clientService.searchForId(id), HttpStatus.OK);
        }
    }

    @DeleteMapping("/delete/{id}")
    public String deleteClients(@PathVariable UUID id) {
        return clientService.delete(id);
    }

    }
