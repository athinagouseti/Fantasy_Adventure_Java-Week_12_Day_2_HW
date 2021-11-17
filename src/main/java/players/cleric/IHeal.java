package players.cleric;

import players.Player;

public interface IHeal {
    void heal(Player player);
    HealingTools changeHeal(HealingTools healingTools);
}
