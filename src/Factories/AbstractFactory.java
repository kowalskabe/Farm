package Factories;

import Models.Animals.Animal;

public abstract class AbstractFactory {
    public abstract Animal getAnimal(AnimalTypes animalType);
}
