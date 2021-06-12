package Models.Animals;/*
zwierzęta
	!- płeć
	!- koszt zakupu
	!- tempo przybierania na wadze (/tydzień)
	!- czas osiągnięcia dojrzałości(tygodnie)
	!- ilość jedzenia (/tydzień)
	- rodzaje jedzenia jakie zwierzę akceptuje
	- czas potrzebny, żeby móc sprzedać
	- szanse na rozmnożenie, jeśli posiadasz więcej niż jedno*/

import Models.Animals.Interfaces.iAnimals;

enum Gender {
    MALE,
    FEMALE
}
enum Food {
    DOGS_FOOD,
    FODDER
}

enum Shelter {
    BUNNY_HOUSE,
    CHICKEN_COOP,
    COWSHED,
    DOVECOTE,
    FARM_HOUSE,
    PIGSTY,
    SHEEPFOLD,
    STABLE
}

public abstract class Animal implements iAnimals {
    final Gender gender;
    private String className = (this.getClass().getName());
    String species = className.substring(className.lastIndexOf(".") + 1);
    Integer age;  // in weeks
    Double weight;
    Integer endOfPuberty;       //after _ weeks
    boolean isMature = false;
    boolean isSellable = false;
    Double weightGein;         //the rate of weight gain per week
    Food foodType;
    Double amountOfFood;       //the amount of food needed per week
    Shelter shelter;

    Animal() {
        this.gender = Gender.FEMALE;  //TO DO --> need to be randomised
    }
}
