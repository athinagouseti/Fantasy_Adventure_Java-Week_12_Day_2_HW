package players.dbk;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Weapons weapon;

    @Before
    public void before(){
        dwarf = new Dwarf(100, Weapons.AXE);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, dwarf.getHealthPoints());
    }

    @Test
    public void hasClub(){
        assertEquals(Weapons.AXE, dwarf.getWeapon());
    }

    @Test
    public void clubHasAttackPower(){
        assertEquals(10, dwarf.getWeapon().attackPower);
    }

    @Test
    public void canChangeWeapon(){
        dwarf.changeWeapon(Weapons.CLUB);
        assertEquals(Weapons.CLUB, dwarf.getWeapon());
        assertEquals(20, dwarf.getWeapon().attackPower);
    }
}
