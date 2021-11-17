package players.dbk;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight;
    Weapons weapon;

    @Before
    public void before(){
        knight = new Knight(100, Weapons.SWORD);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void hasClub(){
        assertEquals(Weapons.SWORD, knight.getWeapon());
    }

    @Test
    public void clubHasAttackPower(){
        assertEquals(10, knight.getWeapon().attackPower);
    }

    @Test
    public void canChangeWeapon(){
        knight.changeWeapon(Weapons.AXE);
        assertEquals(Weapons.AXE, knight.getWeapon());
        assertEquals(10, knight.getWeapon().attackPower);
    }
}
