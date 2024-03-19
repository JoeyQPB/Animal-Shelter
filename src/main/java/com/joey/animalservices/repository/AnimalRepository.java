package com.joey.animalservices.repository;

import com.joey.animalservices.entities.Animal;
import com.joey.animalservices.entities.EmployeeCountDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("Select a from Animal a where a.adoptedName is NULL ORDER BY a.entryDate")
    List<Animal> findNotAdopted();

    @Query("Select a from Animal a where a.adoptedName is NOT NULL")
    List<Animal> findAdopted();

    @Query("Select a from Animal a where a.adoptedName is NULL and a.animal = :animal")
    List<Animal> findNotAdoptedByAnimal(@Param("animal") String animal);

    @Query("Select a from Animal a where a.adoptedName is NOT NULL and a.animal = :animal")
    List<Animal> findAdoptedByAnimal(@Param("animal") String animal);

    @Query("Select a from Animal a where a.animal = :animal")
    List<Animal> findAllByAnimal(@Param("animal") String animal);

    @Query("SELECT new com.joey.EmployeeCountDTO(a.employeeName, COUNT(a)) FROM Animal a GROUP BY a.who_rescued")
    List<EmployeeCountDTO> getAnimalRescuedPerEmployee();
}
