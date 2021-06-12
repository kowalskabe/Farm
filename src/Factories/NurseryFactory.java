package Factories;

import Models.Animals.*;

public class NurseryFactory extends AbstractFactory{
    @Override
    public Animal getAnimal(AnimalTypes animalType) {
        switch (animalType) {
            case CHICKEN:
                return new Chicken();
            case COW:
                return new Cow();
            case DOG:
                return new Dog();
            case DUCK:
                return new Duck();
            case HORSE:
                return new Horse();
            case PIG:
                return new Pig();
            case PIGEON:
                return new Pigeon();
            case SHEEP:
                return new Sheep();
        }
        return null;
    }
}
