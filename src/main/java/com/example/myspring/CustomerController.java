package com.example.myspring;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController{
    @Autowired
    private CustomerRepository repository;

    @GetMapping(path = "/customers")
    public List<Customer> listAll(){
        return repository.findAll();
    }

    @GetMapping(path = "/customers/{id}")
    public Optional<Customer> find(@PathVariable Long id){
        return repository.findById(id);
    }
}