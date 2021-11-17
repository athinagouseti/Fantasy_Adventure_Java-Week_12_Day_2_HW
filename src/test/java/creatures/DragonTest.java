package creatures;

import org.junit.Before;
import org.junit.Test;
import players.creatures.Dragon;
import rooms.enemies.Orc;

import static org.junit.Assert.assertEquals;

public class DragonTest {
    Dragon dragon;
    Orc orc;

    @Before
    public void before(){
        dragon = new Dragon(50);
        orc = new Orc(100, 10);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(50, dragon.getHealthPoints());
    }

    @Test
    public void canDefend(){
        dragon.defend(orc);
        assertEquals(40, dragon.getHealthPoints());
    }
}
