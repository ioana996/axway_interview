package com.axway.restservice.controller;

import com.axway.restservice.entity.Vertex;
import com.axway.restservice.repository.VertexRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/vertices")
public class VertexController {

    @Autowired
    private VertexRepository repository;

    @GetMapping
    public Iterable<Vertex> findAll() {
        return repository.findAll();
    }

    @PostMapping(consumes = "application/json")
    public Vertex create(@RequestBody Vertex vertex) {
        return repository.save(vertex);
    }

    @GetMapping(path = "/{id}")
    public Vertex find(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException());
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }
}
