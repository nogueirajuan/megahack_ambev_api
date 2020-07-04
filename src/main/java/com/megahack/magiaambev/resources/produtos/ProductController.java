package com.megahack.magiaambev.resources.produtos;

import com.megahack.magiaambev.repositories.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/produtos", method = RequestMethod.GET)
public class ProductController {

    @Autowired
    private ProdutosRepository repository;

    @GetMapping(name = "/{id}")
    public ResponseEntity findOne(@PathVariable Integer id) {
        return ResponseEntity.ok().body(repository.findById(id));
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok().body(repository.findAll());
    }

    @PostMapping
    public ResponseEntity create() {
        return ResponseEntity.ok().body(null);
    }

    @PutMapping
    public ResponseEntity update() {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

    @DeleteMapping(name = "/{id}")
    public ResponseEntity deleteProduct(@PathVariable Integer id) {
        repository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }
}
