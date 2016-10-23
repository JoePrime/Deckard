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

    public static final int DEFAULTSIZE = 5;
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
     * Adds the given card to the hand. Does not add the card if the MAXHANDSIZE
     * would be exceeded.
     *
     * @param card The given card.
     * @return Returns true if the card was added to the hand, and false
     * otherwise.
     */
    public boolean addCard(Card card) {
        if (cards.size() < MAXHANDSIZE) {
            cards.add(card);
            return true;
        }
        return false;

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
     *
     * @param card The card being asked about.
     * @return True if there is at least one of the given card, false otherwise.
     */
    public boolean containsCard(Card card) {
        return cards.contains(card);
    }

    /**
     * Tells how many cards are in the hand.
     *
     * @return The amount of cards in the hand.
     */
    public int size() {
        return cards.size();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

}
