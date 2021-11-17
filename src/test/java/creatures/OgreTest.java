package creatures;

import org.junit.Before;
import org.junit.Test;
import players.creatures.Ogre;
import rooms.enemies.Orc;

import static org.junit.Assert.assertEquals;

public class OgreTest {
    Ogre ogre;
    Orc orc;

    @Before
    public void before(){
        ogre = new Ogre(50);
        orc = new Orc(100, 10);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(50, ogre.getHealthPoints());
    }

    @Test
    public void canDefend(){
        ogre.defend(orc);
        assertEquals(40, ogre.getHealthPoints());
    }
}
