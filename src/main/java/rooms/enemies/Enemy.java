package rooms.enemies;

import players.Player;

public abstract class Enemy implements IEnemyActions{

    private int healthPoints;
    private int attackPower;

    public Enemy(int healthPoints, int attackPower) {
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public int getAttackPower(){
        return this.attackPower;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void attack(Player player){
        player.setHealthPoints(player.getHealthPoints() - this.attackPower);
    }

}
