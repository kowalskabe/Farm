package Models.Animals;

import Models.Animals.Fowl;

public final class Pigeon extends Fowl {

    public Pigeon (){

        this.weight = 0.030;
        this.age = 0;
        this.endOfPuberty = 25;
        this.foodType = Food.FODDER;
        this.isMature = false;
        this.isSellable = false;
        this.weightGein = 0.015; // more or less per week
        this.amountOfFood = 0.56;       //the amount of food needed per week
        this.shelter = Shelter.DOVECOTE;

        this.isEggsForSale = false;
        this.numberOfEggs = 2; //TO DO - needs to be randomised
        this.hatchingEggs = 3;
        this.isBreedingPeriod = false;
    }

    @Override
    public void displayInfo() {
        System.out.println(species);
    }

    @Override
    public void feed() {

    }

    @Override
    public void sell() {

    }
}
