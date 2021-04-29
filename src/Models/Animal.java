package Models;/*
zwierzęta
	!- płeć
	!- koszt zakupu
	!- tempo przybierania na wadze (/tydzień)
	!- czas osiągnięcia dojrzałości(tygodnie)
	!- ilość jedzenia (/tydzień)
	- rodzaje jedzenia jakie zwierzę akceptuje
	- czas potrzebny, żeby móc sprzedać
	- szanse na rozmnożenie, jeśli posiadasz więcej niż jedno*/

import java.util.Date;
import Interfaces.Animals;

enum Gender {MALE, FEMALE}
enum Food {}
enum Shelter {CHICKEN_COOP, DOVECOTE}
public abstract class Animal implements Animals {
    Gender gender;
    Date birthDate;
    Integer endOfPuberty;       //after _ weeks
    boolean isMature = false;
    boolean isSellable;
//    Integer pregnancyPeriod; //in weeks
//    boolean isPregnant;
    Integer weightGein;         //the rate of weight gain per week
    Integer amountOfFood;       //the amount of food needed per week
    Shelter shelter;
    Double purchasePrice;
    Double currentPrice;
}
