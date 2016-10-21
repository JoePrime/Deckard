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
    String description;

    /**
     * The constructor for the card.
     */
    public Card() {
        
    }
    
    public Card(String name, int mana, String description) {
        this.name = name;
        this.mana = mana;
        this.description = description;
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
                && card.getDescription().equals(this.description)) {
            return true;
        }
        return false;
    }
    
    /**
     * This method is used to write the html description for the cards. This
     * text contains all the info on the card and is shown in the card's slot
     * in the BattleView part of the graphical user interface.
     * @return The textual info of the card.
     */
    @Override
    public String toString() {
        return "<html>Cost: " + this.mana + "<br/>" + this.name.toUpperCase() + "<br/>" + this.description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
