package Models;/*
*Kupno/sprzedaż zwierząt i produktów rolnych
Dodaj obsługę wahań ceny sprzedaży produktów rolnych (10%) - cena może ulegać losowym wahaniom, możesz sprzedać plony od razu po zbiorach lub przechowywać je jakiś czas i czekać na lepszą okazję.
 */
// ----->  singleton design pattern
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Market {
    private static Market uniqueInstance = new Market();

    //private ArrayList priceList = new ArrayList<MarketItem>();
    private HashMap priceList = new HashMap<Integer, MarketItem>();
    private Iterator itr;
    private Object object;

    private Market (){
        //priceList.add(new MarketItem("Chicken", 10.0, 12.0, 15));
        //priceList.add(new MarketItem("Duck", 20.0, 25.0, 10));
        //priceList.add(new MarketItem("Pigeon", 50.0, 70.0, 5));
        priceList.put(1, new MarketItem("Chicken", 10.0, 12.0, 15));
        priceList.put(2, new MarketItem("Duck", 20.0, 25.0, 10));
        priceList.put(3, new MarketItem("Pigeon", 20.0, 25.0, 10));
    }

    public void displayInfo(){
        System.out.println("_________________________________________PRICE LIST_________________________________________");
        System.out.println();
        System.out.println("product id \t|\tproduct name \t|\tpurchase price\t|\tselling price\t|\tavailable amount\n");
        priceList.forEach((key, value) -> {
            System.out.print("\t" + key);
            ((MarketItem) value).displayItem();
        });

        System.out.println();
    }
    //  you can sell your things for the purchase price
    public void sell(Integer id){
        ((MarketItem) priceList.get(id)).updateAmount(1);  //update() - price list and current farmers farm
        System.out.println("one sold");

    }
    // you can buy items for selling price
    public String buy(Integer id){
        ((MarketItem) priceList.get(id)).updateAmount((-1));
        System.out.println("one bought");
        return ((MarketItem) priceList.get(id)).getName().toString();
    }

    public static Market getInstance(){
        return uniqueInstance;
    }
}
