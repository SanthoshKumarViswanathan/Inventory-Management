package com.inventory.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.Entity.InventoryDetails;
import com.inventory.Repository.InventoryRepository;
import com.inventory.Repository.LoginUserRepository;


@RestController
public class APIController {
    
    @Autowired
    private InventoryRepository repository;

    @Autowired
    private LoginUserRepository loginRepository;

    @GetMapping("login")
    private int LoginUser (@RequestParam ("username") String loginUsername, @RequestParam ("password") String loginPassword) {
        return loginRepository.checkUser(loginUsername, loginPassword);
    }

   
    @GetMapping("data")
    private List<InventoryDetails> getAll() {
        return repository.findAll();
    }

    @GetMapping("id")
    private Optional<InventoryDetails> getById (@RequestParam ("id") int id) {
        return repository.findById(id);
    }
 

    @PostMapping("data")
    private InventoryDetails saveById (@RequestBody InventoryDetails details) {
        return repository.save(details);
    }

    @PutMapping("data")
    private InventoryDetails updateById (@RequestBody InventoryDetails details) {
        return repository.save(details);
    }

   
    @DeleteMapping("data")
    private void removeById (@RequestParam ("id") int id) {
         repository.deleteById(id);
    }

}
