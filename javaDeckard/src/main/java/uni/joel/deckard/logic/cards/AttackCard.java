package uni.joel.deckard.logic.cards;

import uni.joel.deckard.logic.Player;

public class AttackCard extends Card {
    
    public int damage = 13;

    public AttackCard(String name, int mana, String desc) {
        super(name, mana, desc);
    }
    
    @Override
    public void invoke(Player user) {
        user.getOpponent().lowerHitpoints(damage);
    }

}
