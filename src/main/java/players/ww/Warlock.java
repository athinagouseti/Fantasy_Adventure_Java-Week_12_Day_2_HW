package players.ww;

import players.Player;
import rooms.enemies.Enemy;

public class Warlock extends Player implements ISpells{
    private Spells spell;

    public Warlock(int healthPoints, Spells spell) {
        super(healthPoints);
        this.spell = spell;
    }


    public void castSpell(Enemy enemy) {
        enemy.setHealthPoints(enemy.getHealthPoints() - this.spell.spellPower);
    }


    public Spells changeSpell(Spells spell) {
        return this.spell = spell;
    }

    public Spells getSpell(){
        return this.spell;
    }


}
