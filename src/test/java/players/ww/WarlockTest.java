package players.ww;

import org.junit.Before;
import org.junit.Test;
import players.creatures.Dragon;
import rooms.enemies.Orc;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;
    Orc orc;
    Dragon dragon;

    @Before
    public void before(){
        warlock = new Warlock(100, Spells.FIREBALL);
        orc = new Orc(100, 10);
        dragon = new Dragon(50);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, warlock.getHealthPoints());
    }

    @Test
    public void hasSpell(){
        assertEquals(Spells.FIREBALL, warlock.getSpell());
    }

    @Test
    public void canChangeSpell(){
        warlock.changeSpell(Spells.LIGHTNING);
        assertEquals(Spells.LIGHTNING, warlock.getSpell());
    }

    @Test
    public void canCastSpell(){
        warlock.castSpell(orc);
        assertEquals(90, orc.getHealthPoints() );
    }

    @Test
    public void creatureListIsEmpty(){
        assertEquals(0, warlock.getCreatureList());
    }

    @Test
    public void canAddCreature(){
        warlock.addCreature(dragon);
        assertEquals(1, warlock.getCreatureList());
    }

}
