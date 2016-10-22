package uni.joel.deckard.logic;

import java.util.ArrayList;
import java.util.HashMap;
import uni.joel.deckard.logic.cards.Card;

/**
 * A player in a battle has a hand composed of a few cards. These are the cards
 * they can next use in battle.
 *
 * @author Joel
 */
public class Hand {

    /**
     * The maximum amount of cards a player can have in their hand at once.
     */
    public static final int MAXHANDSIZE = 10;
    
    /**
     * The cards in the hand as an ArrayList.
     */
    public ArrayList<Card> cards;

    /**
     * Constructor for Hand. Creates a new empty ArrayList;
     */
    public Hand() {
        cards = new ArrayList<Card>();
    }

    /**
     * Adds the given card to the hand.
     *
     * @param card The given card.
     */
    public void addCard(Card card) {
        if (cards.size()< MAXHANDSIZE) {
            cards.add(card);
        }
        
    }

    /**
     * Removes one of the given card from the hand. Does nothing if no amount of
     * given card is in the hand.
     *
     * @param card The card, one of which should be removed.
     */
    public void removeCard(Card card) {
        if (cards.contains(card)) {
            cards.remove(card);
        }
    }

    /**
     * Tells if there is any of the given card in the hand.
     * @param card The card being asked about.
     * @return True if there is at least one of the given card, false otherwise.
     */
    public boolean containsCard(Card card) {
        return cards.contains(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

}
