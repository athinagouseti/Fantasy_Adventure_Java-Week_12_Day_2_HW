package players.ww;

import org.junit.Before;
import org.junit.Test;
import players.creatures.Creature;
import players.creatures.Dragon;
import rooms.enemies.Orc;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    Wizard wizard;
    Orc orc;
    Dragon dragon;

    @Before
    public void before(){
        wizard = new Wizard(100, Spells.FIREBALL);
        orc = new Orc(100, 10);
        dragon = new Dragon(50);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, wizard.getHealthPoints());
    }

    @Test
    public void hasSpell(){
        assertEquals(Spells.FIREBALL, wizard.getSpell());
    }

    @Test
    public void canChangeSpell(){
        wizard.changeSpell(Spells.LIGHTNING);
        assertEquals(Spells.LIGHTNING, wizard.getSpell());
    }

    @Test
    public void canCastSpell(){
        wizard.castSpell(orc);
        assertEquals(90, orc.getHealthPoints() );
    }

    @Test
    public void creatureListIsEmpty(){
        assertEquals(0, wizard.getCreatureList());
    }

    @Test
    public void canAddCreature(){
        wizard.addCreature(dragon);
        assertEquals(1, wizard.getCreatureList());
    }
}
