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
     */
     public AttackCard() {
        super("Sword", 8, "A sword used to strike the opponent.");
    }
    
    /**
     * An alternative constructor for the AttackCard, in which the values are
     * given.
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

    /**
     * This method calls the superclass's method to return the description of
     * the card to be put in the card's
     * place in the GUI, and adds the amount of damage it does to it.
     * @return The textual description of the card.
     */
    @Override
    public String toString() {
        return super.toString() + "<br/>" + "Damage: " + DAMAGE + "</html>";
    }
}
