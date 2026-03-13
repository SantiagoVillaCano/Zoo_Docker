package com.zoo.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.zoo.backend.model.Animal;
import com.zoo.backend.service.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/animales")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AnimalController {

    private final AnimalService service;

    @GetMapping
    public List<Animal> listar(){
        return service.listar();
    }

    @PostMapping
    public Animal guardar(@RequestBody Animal animal){
        return service.guardar(animal);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        service.eliminar(id);
    }
}