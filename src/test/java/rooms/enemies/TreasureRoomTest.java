package rooms.enemies;

import org.junit.Before;
import org.junit.Test;
import players.dbk.Barbarian;
import players.dbk.Weapons;
import rooms.Treasure;
import rooms.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;
    Barbarian barbarian;

    @Before
    public void before(){
        treasureRoom = new TreasureRoom();
        barbarian = new Barbarian(100, Weapons.CLUB);
    }

    @Test
    public void hasEmptyTreasureChest(){
        assertEquals(0, treasureRoom.getTreasureChest());
    }

    @Test
    public void canAddTreasureInChest(){
        treasureRoom.addTreasureInChest(Treasure.GEMS);
        assertEquals(1, treasureRoom.getTreasureChest());
    }

    @Test
    public void giveTreasureToPlayer(){
        treasureRoom.addTreasureInChest(Treasure.GEMS);
        treasureRoom.addTreasureInChest(Treasure.GOLD);
        treasureRoom.addTreasureInChest(Treasure.GOLD);
        treasureRoom.giveTreasureToPlayer(barbarian, Treasure.GOLD);
        assertEquals(2, treasureRoom.getTreasureChest());
        assertEquals(1, barbarian.getChest());
    }
}
