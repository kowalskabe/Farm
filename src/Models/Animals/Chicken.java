package Models.Animals;

public final class Chicken extends Fowl {


    public Chicken (){

        this.weight = 0.035;
        this.age = 0;
        this.endOfPuberty = 20;
        this.foodType = Food.FODDER;
        this.isMature = false;
        this.isSellable = false;
        this.weightGein = 0.150; // more or less per week
        this.amountOfFood = 0.850;       //the amount of food needed per week
        this.shelter = Shelter.CHICKEN_COOP;

        this.isEggsForSale = true;
        this.numberOfEggs = 6; //TO DO - needs to be randomised
        this.hatchingEggs = 3;
        this.breedingEggs = 20;
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
