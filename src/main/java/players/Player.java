package players;

import rooms.Treasure;
import rooms.TreasureRoom;

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

    public int getChest() {
        return this.chest.size();
    }

    public void receiveTreasure(Treasure treasure) {
        this.chest.add(treasure);
    }
}
