package players.cleric;

public enum HealingTools {
    POTION(10),
    HERB(10),
    PLASTER(5);

    public final int healingPower;
    HealingTools(int healingPower){
        this.healingPower = healingPower;
    }
}
