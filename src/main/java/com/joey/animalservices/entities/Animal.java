package com.joey.animalservices.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "animal", nullable = false)
    private String animal;

    @Column(name = "provisional_name", nullable = false)
    private String provisionalName;

    @Column(name = "estimated_age", nullable = false)
    private Integer estimatedAge;

    @Column(name = "breed", nullable = false)
    private String breed;

    @Column(name = "entry_date", nullable = false)
    private Date entryDate;

    @Column(name = "adoption_date")
    private Date adoptionDate;

    @Column(name = "entry_condition", nullable = false)
    private String entryCondition;

    @Column(name = "who_rescued", nullable = false)
    private String whoRescued;

    @Column(name = "date_of_death")
    private Date dateOfDeath;

    @Column(name = "animal_size", nullable = false)
    private String animalSize;

    public Animal() {}

    public Integer getId() {
        return id;
    }

    public String getAnimal() {
        return this.animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getProvisionalName() {
        return provisionalName;
    }

    public void setProvisionalName(String provisionalName) {
        this.provisionalName = provisionalName;
    }

    public Integer getEstimatedAge() {
        return estimatedAge;
    }

    public void setEstimatedAge(Integer estimatedAge) {
        this.estimatedAge = estimatedAge;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(Date adoptionDate) {
        this.adoptionDate = adoptionDate;
    }

    public String getEntryCondition() {
        return entryCondition;
    }

    public void setEntryCondition(String entryCondition) {
        this.entryCondition = entryCondition;
    }

    public String getAdoptedName() {
        return whoRescued;
    }

    public void setAdoptedName(String adoptedName) {
        this.whoRescued = adoptedName;
    }

    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getAnimalSize() {
        return animalSize;
    }

    public void setAnimalSize(String animalSize) {
        this.animalSize = animalSize;
    }
}
