package com.zoo.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.zoo.backend.model.Animal;
import com.zoo.backend.repository.AnimalRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalService {

    private final AnimalRepository repository;

    public List<Animal> listar(){
        return repository.findAll();
    }

    public Animal guardar(Animal animal){
        return repository.save(animal);
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }
}