package players.ww;

import org.junit.Before;
import org.junit.Test;
import rooms.enemies.Orc;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;
    Orc orc;

    @Before
    public void before(){
        warlock = new Warlock(100, Spells.FIREBALL);
        orc = new Orc(100, 10);
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


}
