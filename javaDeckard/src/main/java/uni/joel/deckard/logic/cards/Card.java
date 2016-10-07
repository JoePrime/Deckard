package uni.joel.deckard.logic.cards;

import java.util.Objects;
import uni.joel.deckard.logic.Player;

/**
 * Abstract Card class used a base for all the other card classes. All cards
 * have a name, a cost (mana) and a description.
 *
 * @author Joel
 */
public abstract class Card {

    String name;
    int mana;
    String desc;

    /**
     * Constructor for the card.
     * @param name The name of the card.
     * @param mana The mana value (cost) of the card.
     * @param desc The description of what the card does.
     */
    public Card(String name, int mana, String desc) {
        this.name = name;
        this.mana = mana;
        this.desc = desc;
    }

    /**
     * The method that activates the card's effect. Execution of the method
     * depends on the card.
     *
     * @param player The player that invokes the card.
     */
    public void invoke(Player player) {

    }

    @Override
    public boolean equals(Object obj) {
        Card card = (Card) obj;
        if (this.getClass() == card.getClass()
                && card.getName().equals(this.name)
                && card.getMana() == this.mana
                && card.getDesc().equals(this.desc)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
