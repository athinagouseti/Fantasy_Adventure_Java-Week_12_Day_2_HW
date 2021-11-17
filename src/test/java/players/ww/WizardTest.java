package players.ww;

import org.junit.Before;
import org.junit.Test;
import rooms.enemies.Orc;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    Wizard wizard;
    Orc orc;

    @Before
    public void before(){
        wizard = new Wizard(100, Spells.FIREBALL);
        orc = new Orc(100, 10);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, wizard.getHealthPoints());
    }

    @Test
    public void hasSpell(){
        assertEquals(Spells.FIREBALL, wizard.getSpell());
    }

    @Test
    public void canChangeSpell(){
        wizard.changeSpell(Spells.LIGHTNING);
        assertEquals(Spells.LIGHTNING, wizard.getSpell());
    }

    @Test
    public void canCastSpell(){
        wizard.castSpell(orc);
        assertEquals(90, orc.getHealthPoints() );
    }
}
