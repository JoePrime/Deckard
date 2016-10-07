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

    public Hand() {
        cards = new HashMap<Card, Integer>();
    }

    public void addCard(Card card) {
        if (cards.containsKey(card)) {
            int amount = cards.get(card);
            cards.replace(card, amount, amount + 1);
        } else {
            cards.put(card, 1);
        }
    }

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

    public void removeCard(Card card) {
        removeAmountOfCard(card, 1);
    }
    
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
