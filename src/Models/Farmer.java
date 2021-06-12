/*
* Wygrywa gdy posiada co najmniej
* >>> 20 hektarów,
* >>> 5 różnych gatunków zwierząt hodowlanych,
* >>> 5 różnych gatunków upraw,
* >>> jedzenie dla wszystkich swoich zwierząt na rok.
Początkowy budżet i ceny powinny być tak dobrane, aby nie było możliwe spełnienie wszystkich tych marzeń bez zebrania plonów.
 */

package Models;

import Models.Animals.Animal;

import java.io.Console;
import java.util.ArrayList;
import java.lang.reflect.*;

public class Farmer {
    /*
    właściciel-gracz
	- gotówka na start
	- farmy - na start 0
	- ziemia w hektarach - na start 0
    */
    public String name = "player";
    Double money = 50_000.0;

    Farm farm = new Farm();

    public void update(){
        System.out.println("Update farmer info after selling smth");
    }
    public void update(Animal boughtAnimal){
        //System.out.println("Update farmer info after buying "+ boughtAnimal);
        farm.update(boughtAnimal);

    }

    public void displayInfo(){
        System.out.println(">>>> Farmer: "+ name.toUpperCase());
    }

    public void displayFarmInfo(){
        farm.displayInfo();
    }
}

