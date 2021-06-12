package Models.Animals;

public final class Duck extends Fowl {

    public Duck (){
        this.weight = 0.060;
        this.age = 0;
        this.endOfPuberty = 25;
        this.foodType = Food.FODDER;
        this.isMature = false;
        this.isSellable = false;
        this.weightGein = 0.150; // more or less per week
        this.amountOfFood = 1.1;       //the amount of food needed per week
        this.shelter = Shelter.CHICKEN_COOP;

        this.isEggsForSale = true;
        this.numberOfEggs = 5; //TO DO - needs to be randomised
        this.hatchingEggs = 4;
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
