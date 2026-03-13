package com.zoo.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zoo.backend.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}