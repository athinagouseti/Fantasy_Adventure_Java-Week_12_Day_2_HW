package players.ww;

import rooms.enemies.Enemy;

public interface ISpells {
    void castSpell(Enemy enemy);
    Spells changeSpell(Spells spell);
}
