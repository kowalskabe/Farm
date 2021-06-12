package Models;/*
* farma
	- ziemia w hektarach
	- budynki
	- zwierzęta - gracz może hodować
	- uprawy - gracz może uprawiać
	- zbiory
		- sprzedać
		- przechowywać
		- używać do karmienia zwierząt
*/

import Models.Animals.Animal;
import Models.Animals.Chicken;
import Models.Animals.Duck;
import Models.Animals.Pigeon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Farm {
    HashMap buildings = new HashMap<String, Integer>();
    Double arebleLand = 0.0;
    ArrayList <Animal> animals = new ArrayList();

    public void update(Animal animal){
        animals.add(animal);
    }
    public void displayInfo() {
        System.out.println("| Farm:");
        System.out.println("| Animals:");
        for (Animal animal : animals) {
            animal.displayInfo();
        }
    }
}
