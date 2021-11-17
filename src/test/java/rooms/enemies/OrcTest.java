package rooms.enemies;

import org.junit.Before;
import org.junit.Test;
import players.dbk.Barbarian;
import players.dbk.Weapons;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;
    Barbarian barbarian;

    @Before
    public void before(){
        orc = new Orc(100, 10);
        barbarian = new Barbarian(100, Weapons.CLUB);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, orc.getHealthPoints());
    }

    @Test
    public void hasAttackPower(){
        assertEquals(10, orc.getAttackPower());
    }

    @Test
    public void canAttack(){
        orc.attack(barbarian);
        assertEquals(90, barbarian.getHealthPoints());
    }

}
