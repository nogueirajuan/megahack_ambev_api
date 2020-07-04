package com.megahack.magiaambev.resources.lojas;

import com.megahack.magiaambev.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/lojas")
public class StoreController {

    @Autowired
    private StoreRepository repository;

    /*
    @GetMapping
    public ResponseEntity findOneStore(Integer id) {
        return ResponseEntity.ok().body(repository.findById(id));
    }

    @GetMapping
    public ResponseEntity findAllStores() {
        return ResponseEntity.ok().body(repository.findAll());
    }

    @PostMapping
    public ResponseEntity createStore() {
        return ResponseEntity.ok().body(null);
    }

    @PutMapping
    public ResponseEntity updateStore() {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    } */

    @DeleteMapping(name = "{id}")
    public ResponseEntity deleteStore(@PathVariable Integer id) {
        repository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }
}
