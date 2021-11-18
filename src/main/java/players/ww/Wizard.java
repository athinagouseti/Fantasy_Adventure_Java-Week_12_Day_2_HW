package players.ww;

import players.Player;
import players.creatures.Creature;
import rooms.enemies.Enemy;

import java.util.ArrayList;

public class Wizard extends Player implements ISpells{
    private Spells spell;
    private ArrayList<Creature> creatureList;

    public Wizard(int healthPoints, Spells spell) {
        super(healthPoints);
        this.spell = spell;
        this.creatureList = new ArrayList<>();
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

    public int getCreatureList(){
        return this.creatureList.size();
    }

    public void addCreature(Creature creature){
        this.creatureList.add(creature);
    }

}
