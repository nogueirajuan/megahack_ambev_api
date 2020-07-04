package com.megahack.magiaambev.resources.users;

import com.megahack.magiaambev.domain.User;
import com.megahack.magiaambev.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/{id}")
    public ResponseEntity findOne(@PathVariable Integer id) {
        return ResponseEntity.ok().body(repository.findById(id));
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok().body(repository.findAll());
    }

    @PostMapping
    public ResponseEntity create(@RequestBody User user) {
        return ResponseEntity.ok().body(repository.save(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@RequestBody User user) {
        repository.save(user);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        repository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }
}
