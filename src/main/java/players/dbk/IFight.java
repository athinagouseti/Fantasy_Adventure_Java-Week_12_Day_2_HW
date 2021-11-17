package players.dbk;

import rooms.enemies.Enemy;

public interface IFight {
    void fight(Enemy enemy);
    Weapons changeWeapon(Weapons weapons);
}
