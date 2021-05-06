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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;

public class Farm {
    HashMap buildings = new HashMap<String, Integer>();
    Double arebleLand = 0.0;

    ArrayList ducks = new ArrayList<Duck>();
    ArrayList chickens = new ArrayList<Chicken>();
    ArrayList pigeons = new ArrayList<Pigeon>();

    public void displayInfo() {
        System.out.println("| Farm:");
        System.out.println("| \tDucks:\t\t"+ ducks.size());
        System.out.println("| \tChicken:\t"+ chickens.size());
        System.out.println("| \tPigeons:\t"+ pigeons.size());
    }
}
