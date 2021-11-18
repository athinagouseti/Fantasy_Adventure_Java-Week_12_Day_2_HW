package rooms.enemies;

import org.junit.Before;
import org.junit.Test;
import players.ww.Spells;
import players.ww.Warlock;
import rooms.EnemyRoom;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    EnemyRoom enemyRoom;
    Orc orc;
    Warlock warlock;

    @Before
    public void before(){
        enemyRoom = new EnemyRoom();
        orc = new Orc(20, 10);
        warlock = new Warlock(30, Spells.TIDALWAVE);
    }

    @Test
    public void startsEmptyEnemyList(){
        assertEquals(0, enemyRoom.getEnemiesList());
    }

    @Test
    public void canAddEnemy(){
        enemyRoom.addEnemies(orc);
        assertEquals(1, enemyRoom.getEnemiesList());
    }

    @Test
    public void canCompleteRoom(){
        orc.setHealthPoints(0);
        enemyRoom.addEnemies(orc);
        enemyRoom.setRoomToCompleted();
       assertEquals(true, enemyRoom.getRoomCompleted());
    }
}
