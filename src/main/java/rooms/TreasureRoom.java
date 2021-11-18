package rooms;

import players.Player;

import java.util.ArrayList;

public class TreasureRoom {
    private ArrayList<Treasure> treasureChest;

    public TreasureRoom() {
        this.treasureChest = new ArrayList<>();
    }

    public int getTreasureChest() {
        return this.treasureChest.size();
    }

    public void addTreasureInChest(Treasure treasure) {
        this.treasureChest.add(treasure);
    }


    public void giveTreasureToPlayer(Player player, Treasure treasure) {
        this.treasureChest.remove(treasure);
        player.receiveTreasure(treasure);
    }
}
