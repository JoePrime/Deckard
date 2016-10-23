package uni.joel.deckard.logic.cards;

import uni.joel.deckard.logic.Player;

/**
 * An attacking card that reduces the opponent's armor, or health if the
 * opponent doesn't have any armor.
 *
 * @author Joel
 */
public class AttackCard extends Card {

    public static final int DAMAGE = 13;
    public static final int MANACOST = 8;

    /**
     * Constructor for the AttackCard.
     */
    public AttackCard() {
        super("Sword", MANACOST, "A sword used to strike the opponent.");
    }

    /**
     * An alternative constructor for the AttackCard, in which the values are
     * given.
     *
     * @param name Name of the card.
     * @param manaCost Mana value of the card.
     * @param desc Description of the card.
     */
    public AttackCard(String name, int manaCost, String desc) {
        super(name, manaCost, desc);
    }

    /**
     * AttackCard's invoke-method reduces the opponent's armor by the DAMAGE
     * amount or, if the opponent doesn't have enough armor, reduces the rest
     * from the opponent's hitpoints. First checks that the user has enough
     * mana.
     *
     * @param user The Player using the card.
     */
    @Override
    public void invoke(Player user) {
        int opponentArmor = user.getOpponent().getArmor();
        if (opponentArmor >= DAMAGE) {
            user.getOpponent().changeArmorBy(-DAMAGE);
        } else {
            int overFlow = DAMAGE - opponentArmor;
            user.getOpponent().setArmor(0);
            user.getOpponent().changeHitpointsBy(-overFlow);
        }
    }

    /**
     * This method calls the superclass's method to return the description of
     * the card to be put in the card's place in the GUI, and adds the amount of
     * damage it does to it.
     *
     * @return The textual description of the card.
     */
    @Override
    public String toString() {
        return super.toString() + "<br/>" + "Damage: " + DAMAGE + "</html>";
    }
}
