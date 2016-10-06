package uni.joel.deckard.logic;

import java.util.ArrayList;
import uni.joel.deckard.logic.cards.Card;

/**
 * A player in a battle has a hand composed of a few cards. These are the cards
 * they can next use in battle.
 *
 * @author Joel
 */

// This Class is unused for now and has been replaced with an arraylist in the
// class Player.
public class Hand {

    public ArrayList<Card> cards;
    public int currentSize = 0;

    public Hand() {
        cards = new ArrayList();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public boolean removeCard(Card card) {
        if (cards.contains(card)) {
            return cards.remove(card);
        } else {
            System.out.println("Can't remove card from deck that is not in the"
                    + "deck");
            return false;
        }
    }

    public boolean contains(Card card) {
        if (cards.contains(card)) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

}
