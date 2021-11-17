package players.dbk;

public enum Weapons {
    SWORD(10),
    AXE(10),
    CLUB(20);

    public final int attackPower;
    Weapons(int attackPower){
        this.attackPower = attackPower;
    }



}
