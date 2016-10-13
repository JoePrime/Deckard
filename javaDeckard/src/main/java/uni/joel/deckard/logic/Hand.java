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

    public HashMap<Card, Integer> cards;
    public int currentSize = 0;

    /**
     * Constructor for Hand.
     */
    public Hand() {
        cards = new HashMap<Card, Integer>();
    }

    /**
     * Adds the given card to the hand.
     *
     * @param card The given card.
     */
    public void addCard(Card card) {
        if (cards.containsKey(card)) {
            int amount = cards.get(card);
            cards.replace(card, amount, amount + 1);
        } else {
            cards.put(card, 1);
        }
    }

    /**
     * Removes the specified amount of the given card from the hand, or as much
     * as possible if the amount to be removed is larger than the amount of card
     * in the hand.
     *
     * @param card The card to be removed.
     * @param removeAmount The amount to be removed.
     */
    public void removeAmountOfCard(Card card, int removeAmount) {
        if (cards.containsKey(card) && removeAmount > 0) {
            int amount = cards.get(card);
            if (amount > removeAmount) {
                cards.replace(card, amount - removeAmount);
            } else {
                cards.remove(card);
            }
        }
    }

    /**
     * Removes one of the given card from the hand. Does nothing if no amount of
     * given card is in the hand.
     *
     * @param card The card, one of which should be removed.
     */
    public void removeCard(Card card) {
        removeAmountOfCard(card, 1);
    }

    /**
     * Returns the amount of the given card in the hand.
     *
     * @param card The card of which amount is being asked.
     * @return The amount of the card in the hand.
     */
    public int amountOfCard(Card card) {
        if (cards.containsKey(card)) {
            return cards.get(card);
        }
        return 0;
    }

    public HashMap<Card, Integer> getCards() {
        return cards;
    }

    public void setCards(HashMap<Card, Integer> cards) {
        this.cards = cards;
    }

}
