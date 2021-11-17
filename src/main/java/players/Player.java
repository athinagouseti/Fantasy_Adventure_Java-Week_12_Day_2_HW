package players;

import rooms.Treasure;

import java.util.ArrayList;

public abstract class Player {
    private int healthPoints;
    private ArrayList<Treasure> chest;

    public Player(int healthPoints) {
        this.healthPoints = healthPoints;
        this.chest = new ArrayList<>();
    }

    public  int getHealthPoints(){
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
