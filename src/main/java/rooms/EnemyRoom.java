package rooms;

import players.Player;
import players.dbk.IFight;
import rooms.enemies.Enemy;

import java.util.ArrayList;

public class EnemyRoom {
    private ArrayList<Enemy> enemies;
    private Boolean roomCompleted;

    public EnemyRoom() {
        this.enemies = new ArrayList<>();
        this.roomCompleted = false;
    }

    public int getEnemiesList() {
        return this.enemies.size();
    }

    public void addEnemies(Enemy enemy) {
        this.enemies.add(enemy);
    }

    public void setRoomToCompleted(){
        if(enemies.get(0).getHealthPoints() == 0 ) {
            this.roomCompleted = true;
        }
    }

    public Boolean getRoomCompleted() {
        return roomCompleted;
    }
}
