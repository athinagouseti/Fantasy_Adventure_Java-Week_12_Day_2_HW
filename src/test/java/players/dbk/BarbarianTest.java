package players.dbk;

import org.junit.Before;
import org.junit.Test;
import rooms.Treasure;
import rooms.enemies.Orc;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Weapons weapon;
    Orc orc;

    @Before
    public void before(){
        barbarian = new Barbarian(100, Weapons.CLUB);
        orc = new Orc(100, 10);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, barbarian.getHealthPoints());
    }

    @Test
    public void hasClub(){
        assertEquals(Weapons.CLUB, barbarian.getWeapon());
    }

    @Test
    public void clubHasAttackPower(){
        assertEquals(20, barbarian.getWeapon().attackPower);
    }

    @Test
    public void canChangeWeapon(){
        barbarian.changeWeapon(Weapons.AXE);
        assertEquals(Weapons.AXE, barbarian.getWeapon());
        assertEquals(10, barbarian.getWeapon().attackPower);
    }

    @Test
    public void canFight(){
        barbarian.fight(orc);
        assertEquals(80, orc.getHealthPoints() );
    }

    @Test
    public void canReceiveTreasure(){
        barbarian.receiveTreasure(Treasure.GEMS);
        assertEquals(1, barbarian.getChest());
    }
}
