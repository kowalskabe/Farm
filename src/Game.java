import java.io.Console;
import java.util.*;
import java.util.ArrayList;

import Models.*;
import Models.Animals.Animal;

public class Game {
    public static void main(String[] args){
        Market marketPlace = Market.getInstance();
        ScoreBoard scoreBoard = ScoreBoard.getInstance();
        int choice1tier;
        int choice2tier;
        int choice3tier;

        System.out.println("---------------------------------------------   MAIN MENU   ---------------------------------------------");
        System.out.println();

        System.out.print("Number of players:  ");
        Scanner input = new Scanner(System.in);
        int numberOfPlayers = Integer.valueOf(input.next());

        ArrayList listOfPlayers = new ArrayList<Farmer>();

        for (int i = 0; i< numberOfPlayers; i++){
            System.out.print("Player's name:  ");
            String name = input.next();
            Farmer player = new Farmer();
            player.name = name;
            listOfPlayers.add(player);
        }

        System.out.println();

        boolean winnerFlag = false;
        int week = 0;
        while(!winnerFlag) {
            week++;
            System.out.println("---------------------------------------------    RUOUND " + week + "    ---------------------------------------------");
            System.out.println();
            for (Object listOfPlayer : listOfPlayers) {
                Farmer currentPlayer = (Farmer) listOfPlayer;
                //System.out.println("---------------------------------------------------------------------------------------------------------");
                currentPlayer.displayInfo();

                System.out.println("\nAvailable options:");

                do {
                    System.out.println("1. Market place\t\t2. Farm\t\t3. Info\t\t4. Pass");
                    choice1tier = Integer.valueOf(input.next());

                    if (choice1tier == 1) { //Market place

                        do {
                            marketPlace.displayInfo();
                            System.out.print("Do you want to 1. buy, 2. sell, or maybe 3. resign: ");
                            choice2tier = Integer.valueOf(input.next());

                            if (choice2tier == 1) {
                                System.out.print("Enter the id of the product you are interested in: ");
                                int productId = Integer.valueOf(input.next());
                                Animal boughtAnimal = marketPlace.buy(productId);
                                currentPlayer.update(boughtAnimal);
                            } else if (choice2tier == 2) {
                                System.out.print("Enter the id of the product you are interested in: ");
                                int productId = Integer.valueOf(input.next());
                                marketPlace.sell(productId);
                                currentPlayer.update();
                            } else if (choice2tier != 3) {
                                System.out.println("Select a number from the available options!");
                            }
                        } while (choice2tier != 3);

                    } else if (choice1tier == 2) {
                        do {
                            System.out.println("1. Info\t\t2. Return");
                            choice2tier = Integer.valueOf(input.next());
                            if (choice2tier == 1) {
                                currentPlayer.displayFarmInfo();
                            } else if (choice2tier != 2) {
                                System.out.println("Select a number from the available options!");
                            }
                        } while(choice2tier != 2);

                    } else if (choice1tier == 3) {
                        System.out.println("Display score board with info for current player");
                        /**
                         *  your farmland/20h
                         *  your animals species/5 species
                         *  your types of crops/5 types
                         *  food supplies/food supplies for 52 weeks
                         */


                    } else if (choice1tier != 4) {
                        System.out.println("Select a number from the available options!");
                    }
                } while (choice1tier != 4);
            }

                System.out.println("---------------------");

            System.out.println("End of the " + week + " round.");
            System.out.print("There is no winner yet. Do you want to continue the game? yes/no ");

            String decision = (input.next()).toLowerCase();
            System.out.println(decision);
            while (!decision.equals("yes") && !decision.equals("no")) {
                System.out.println("Select from the available options!");
                System.out.print("Do you want to continue the game? yes/no ");
                decision = (input.next()).toLowerCase();
            }

            if (decision.equals("yes")) {
                /*
                *   Rośliny rosna
                *   zwierzeta przybieraja na masie
                *   istnieje pewna, niewielka szansa, że zwierzęta się rozmnożą jeżeli posiada więcej niż jedno
                    ponosisz koszty ochrony roślin przed szkodnikami
                    jeżeli masz kury/krowy/owce dostajesz pieniądze za jajka albo mleko
                    zwierzęta wcinają paszę, jeśli masz dla nich odłożone plony to w pierwszej kolejności ze stodoły, jeżeli nie to musisz je kupić.
                */
                System.out.println("Updating the game world");
            }
            else break;

        }
    }
}
