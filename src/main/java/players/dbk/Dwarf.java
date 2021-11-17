package players.dbk;

import players.Player;
import rooms.enemies.Enemy;

public class Dwarf extends Player implements IFight{
    private Weapons weapon;

    public Dwarf(int healthPoints, Weapons weapon) {
        super(healthPoints);
        this.weapon = weapon;
    }

    public Weapons getWeapon() {
        return this.weapon;
    }

    public void fight(Enemy enemy) {
        enemy.setHealthPoints(enemy.getHealthPoints() - this.weapon.attackPower);
    }

    public Weapons changeWeapon(Weapons weapon) {
        return this.weapon = weapon;
    }
}
