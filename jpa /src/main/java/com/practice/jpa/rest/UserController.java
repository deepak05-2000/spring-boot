package com.practice.jpa.rest;

import com.practice.jpa.domain.UserAddress;
import com.practice.jpa.domain.UserDetails;
import com.practice.jpa.repository.UserAddressRepository;
import com.practice.jpa.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    private final UserRepository userRepository;
    private final UserAddressRepository userAddressRepository;

    public UserController(UserRepository userRepository, UserAddressRepository userAddressRepository) {
        this.userRepository = userRepository;
        this.userAddressRepository = userAddressRepository;
    }


    @PostMapping("/users")
    public ResponseEntity<UserDetails> createUser(
            @RequestBody UserDetails userDetails
    ) throws URISyntaxException {
        return ResponseEntity.created(new URI("/api/users")).body(userRepository.save(userDetails));
    }

    @GetMapping("/users")
    public ResponseEntity<UserDetails> getUser() {
        return ResponseEntity.ok(userRepository.findAll().getFirst());
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<UserDetails> updateUser(
            @PathVariable("id") Long id, @RequestBody UserDetails userDetails
    ) {
        return ResponseEntity.ok(userRepository.save(userDetails));
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/address")
    public ResponseEntity<UserAddress> getAddress() {
        return ResponseEntity.ok(userAddressRepository.findAll().getFirst());
    }

}
