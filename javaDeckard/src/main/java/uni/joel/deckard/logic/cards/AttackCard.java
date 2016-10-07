package uni.joel.deckard.logic.cards;

import uni.joel.deckard.logic.Player;

/**
 * An attacking card that reduces the using player's opponents health.
 *
 * @author Joel
 */
public class AttackCard extends Card {

    public static final int DAMAGE = 13;

    /**
     * Constructor for the AttackCard.
     * @param name Name of the card.
     * @param mana Mana value of the card.
     * @param desc Description of the card.
     */
    public AttackCard(String name, int mana, String desc) {
        super(name, mana, desc);
    }

    @Override
    public void invoke(Player user) {
        user.getOpponent().changeHitpointsBy(-DAMAGE);
    }

}
