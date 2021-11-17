package players.cleric;

import players.Player;

public class Cleric extends Player implements IHeal {
    private HealingTools healingTool;

    public Cleric(int healthPoints, HealingTools healingTool) {
        super(healthPoints);
        this.healingTool = healingTool;
    }

    public HealingTools getHealingTool() {
        return this.healingTool;
    }

    public void heal(Player player) {
        player.setHealthPoints(player.getHealthPoints() + this.healingTool.healingPower);
    }

    public HealingTools changeHeal(HealingTools healingTools) {
        return this.healingTool = healingTools;
    }
}
