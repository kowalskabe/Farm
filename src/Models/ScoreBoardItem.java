package Models;

import java.util.HashSet;
import java.util.Set;

public class ScoreBoardItem {
    private String playerName;
    private Double farmland;
    private Set<String> animalsSpecies;
    private Set<String> typesOfCrops;

    protected ScoreBoardItem(String name) {
        this.playerName = name;
        this.farmland = 0.0;
        this.animalsSpecies = new HashSet<String>();

    }

    protected String getName () {
        return this.playerName;
    }


    protected void displayItem() {
        System.out.println("\t\t|\t"+ playerName + "\t\t\t|\t\t" + farmland  + " / 20ha\t\t|\t\t" + animalsSpecies.size() + " / 5\t\t|\t\t" + typesOfCrops.size() + " / 5\t\t|\t\t");
    }
}
