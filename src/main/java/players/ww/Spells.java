package players.ww;

public enum Spells {
    FIREBALL(10),
    LIGHTNING(15),
    TIDALWAVE(20);

    public final int spellPower;
    Spells(int spellPower){
        this.spellPower = spellPower;
    }
}
