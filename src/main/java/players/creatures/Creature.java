package players.creatures;

import rooms.enemies.Enemy;

public class Creature implements ICreatureActions{
    private int healthPoints;

    public Creature(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void defend(Enemy enemy) {
        this.setHealthPoints(this.healthPoints - enemy.getAttackPower());
    }
}
