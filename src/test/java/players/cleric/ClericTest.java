package players.cleric;

import org.junit.Before;
import org.junit.Test;
import players.dbk.Barbarian;
import players.dbk.Weapons;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    Cleric cleric;
    Weapons weapon;
    Barbarian barbarian;

    @Before
    public void before(){
        cleric = new Cleric(100, HealingTools.HERB);
        barbarian = new Barbarian(100, Weapons.CLUB);
    }

    @Test
    public void hasHealingPoints(){
        assertEquals(100, cleric.getHealthPoints());
    }

    @Test
    public void hasHealingTool(){
        assertEquals(HealingTools.HERB, cleric.getHealingTool());
    }

    @Test
    public void canChangeHeal(){
        cleric.changeHeal(HealingTools.PLASTER);
        assertEquals(HealingTools.PLASTER, cleric.getHealingTool());
    }

    @Test
    public void canHeal(){
        cleric.heal(barbarian);
        assertEquals(110, barbarian.getHealthPoints());
    }
}
