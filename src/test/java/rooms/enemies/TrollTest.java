package rooms.enemies;

import org.junit.Before;
import org.junit.Test;
import players.dbk.Barbarian;
import players.dbk.Weapons;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    Troll troll;
    Barbarian barbarian;

    @Before
    public void before(){
        troll = new Troll(100, 10);
        barbarian = new Barbarian(100, Weapons.CLUB);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, troll.getHealthPoints());
    }

    @Test
    public void hasAttackPower(){
        assertEquals(10, troll.getAttackPower());
    }

    @Test
    public void canAttack(){
        troll.attack(barbarian);
        assertEquals(90, barbarian.getHealthPoints());
    }
}
