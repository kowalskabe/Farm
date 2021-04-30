import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

import Models.*;

public class Game {
    public static void main(String[] args){
        Market marketPlace = Market.getInstance();

        System.out.println("---   MAIN MENU   ---");
        System.out.println();

        System.out.println("Podaj ilosc graczy:  ");
        Scanner input = new Scanner(System.in);
        int numberOfPlayers = Integer.valueOf(input.nextLine());
        ArrayList listOfPlayers = new ArrayList<Farmer>();

        for (int i = 0; i< numberOfPlayers; i++){
            System.out.println("Podaj imię gracza:  ");
            String name = input.nextLine();
            Farmer player = new Farmer();
            player.name = name;
            listOfPlayers.add(player);
        }

        System.out.println();

        boolean winnerFlag = false;
        int week = 0;
        while(!winnerFlag) {
            week++;
            System.out.println("---    RUNDA " + week +"    ---");
            System.out.println();
            for (Object listOfPlayer : listOfPlayers) {
                Farmer currentPlayer = (Farmer) listOfPlayer;
                System.out.println("---------------------");
                currentPlayer.displayInfo();
                System.out.println("---------------------");
            }

            System.out.println("Koniec rundy " + week + ".");
            System.out.println("Brak zwycięzcy. Gramy dalej? tak/nie");
            String decision = input.nextLine();
            if (decision.equals("tak")) continue;
            else if (decision.equals("nie")) break;
        }
    }
}
