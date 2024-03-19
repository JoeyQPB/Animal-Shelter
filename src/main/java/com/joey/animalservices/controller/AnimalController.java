package com.joey.animalservices.controller;

import com.joey.animalservices.entities.Animal;
import com.joey.animalservices.entities.EmployeeCountDTO;
import com.joey.animalservices.repository.AnimalRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    private AnimalRepository repository;

    @Autowired
    public AnimalController(AnimalRepository repository) {
        this.repository = repository;
    }

    // create
    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return this.repository.save(animal);
    }

    // all animals
    @GetMapping
    private List<Animal> findAll() {
        return this.repository.findAll();
    }

    // all not adopted
    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted() {
        return this.repository.findNotAdopted();
    }

    // all not adopted by animal
    @GetMapping("/not-adopted/{animal}")
    private List<Animal> findNotAdoptedByAnimal(@PathVariable String animal) {
        return this.repository.findNotAdoptedByAnimal(animal);
    }

    // all adopted
    @GetMapping("/adopted")
    private List<Animal> findAdopted() {
        return this.repository.findAdopted();
    }

    // all adopted by animal
    @GetMapping("/adopted/{animal}")
    private List<Animal> findAdoptedByAnimal(@PathVariable String animal) {
        return this.repository.findAdoptedByAnimal(animal);
    }

    // all by animal
    @GetMapping("/{animal}")
    private List<Animal> findAllByAnimal(@PathVariable String animal) {
        return this.repository.findAllByAnimal(animal);
    }

    // one animal
    @GetMapping("/{id}")
    private Animal findById(@PathVariable Integer id) {
        return this.repository.findById(id).orElseThrow(() -> new EntityNotFoundException("ID: " + id + " not found!"));
    }

    // edit animal
    @PutMapping("/{id}")
    private Animal update(@RequestBody Animal animal) {
        return this.repository.save(animal);
    }

    // delete animal
    @DeleteMapping("/{id}")
    private void delete(@PathVariable Integer id) {
        this.repository.deleteById(id);
    }

    // qtd de animal que each func rescued
    @GetMapping("/animals-rescued-per-employee")
    private List<EmployeeCountDTO> getAnimalRescuedPerEmployee(@PathVariable Integer id) {
        return this.repository.getAnimalRescuedPerEmployee();
    }
}
