/*
* Wygrywa gdy posiada co najmniej
* >>> 20 hektarów,
* >>> 5 różnych gatunków zwierząt hodowlanych,
* >>> 5 różnych gatunków upraw,
* >>> jedzenie dla wszystkich swoich zwierząt na rok.
Początkowy budżet i ceny powinny być tak dobrane, aby nie było możliwe spełnienie wszystkich tych marzeń bez zebrania plonów.
 */

package Models;

import java.io.Console;
import java.util.ArrayList;

public class Farmer {
    /*
    właściciel-gracz
	- gotówka na start
	- farmy - na start 0
	- ziemia w hektarach - na start 0
    */
    public String name = "player";
    Double money = 50_000.0;

    ArrayList farms = new ArrayList<Farm>();

    ArrayList ducks = new ArrayList<Duck>();
    ArrayList chickens = new ArrayList<Chicken>();
    ArrayList pigeons = new ArrayList<Pigeon>();


     //farmBuildings

    public void displayInfo(){
        System.out.println("Farmer:\t"+ name +"\nMoney:\t" + money);
    }
}

