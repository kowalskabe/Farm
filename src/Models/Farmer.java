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
    ArrayList animalsList = new ArrayList<Animal>();

    public void displayInfo(){
        System.out.println("Farmer: "+ name);
    }
}

