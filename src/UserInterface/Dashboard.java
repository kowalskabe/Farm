package UserInterface;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

import Models.Farmer;


public class Dashboard {

    public static void main(String[] args) {

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
        while(!winnerFlag){
            week++;
            for (Object listOfPlayer : listOfPlayers) {
                Farmer currentPlayer = (Farmer) listOfPlayer;
                System.out.println("---------------------");
                currentPlayer.displayInfo();
                System.out.println("---------------------");
            }

            System.out.println("Koniec rundy " + week + ".");
            System.out.println("Gramy dalej? tak/nie");
            String decision = input.nextLine();
            if (decision.equals("tak")) continue;
            else if (decision.equals("nie")) break;

        }

    }
}
