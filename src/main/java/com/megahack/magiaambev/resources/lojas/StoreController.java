package com.megahack.magiaambev.resources.lojas;

import com.megahack.magiaambev.domain.Store;
import com.megahack.magiaambev.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/lojas")
public class StoreController {

    @Autowired
    private StoreRepository repository;

    @GetMapping("/{id}")
    public ResponseEntity findOneStore(@PathVariable Integer id) {
        return ResponseEntity.ok().body(repository.findById(id));
    }

    @GetMapping
    public ResponseEntity findAllStores() {
        return ResponseEntity.ok().body(repository.findAll());
    }

    @PostMapping
    public ResponseEntity createStore(@RequestBody Store store) {
        return ResponseEntity.ok().body(repository.save(store));
    }

    @PutMapping("/{id}")
    public ResponseEntity updateStore(@RequestBody Store store) {
        repository.save(store);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteStore(@PathVariable Integer id) {
        repository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }
}
