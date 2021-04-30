package Models;/*
*Kupno/sprzedaż zwierząt i produktów rolnych
Dodaj obsługę wahań ceny sprzedaży produktów rolnych (10%) - cena może ulegać losowym wahaniom, możesz sprzedać plony od razu po zbiorach lub przechowywać je jakiś czas i czekać na lepszą okazję.
 */
// ----->  singleton design pattern
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Market {
    private static Market uniqueInstance = new Market();

    private HashMap priceList = new HashMap<String, Double>();

    private HashMap purchasePriceList = new HashMap<String, Double>();
    private Iterator itr;

    private Market (){
        priceList.put("Chicken", 10.0);
        priceList.put("Duck", 15.0);
        priceList.put("Pigeon", 50.0);
    }

    public void displayPrices() {
        priceList.forEach((key, value) -> System.out.println(key + "\t\t" + value));
    }
    public void sell(){
        System.out.println("Sprzedales cos");
    }
    public void buy(){
        System.out.println("Kupiles cos");
    }

    public static Market getInstance(){
        return uniqueInstance;
    }
}
