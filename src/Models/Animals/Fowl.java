package Models.Animals;

import Models.Animals.Animal;

public abstract class Fowl extends Animal {
    boolean isEggsForSale;
    Integer numberOfEggs;
    Integer hatchingEggs;   //in weeks
    Integer breedingEggs;
    boolean isBreedingPeriod;
}
