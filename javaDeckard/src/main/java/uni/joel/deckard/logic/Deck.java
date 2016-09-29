package uni.joel.deckard.logic;

import uni.joel.deckard.logic.cards.Card;
import java.util.ArrayList;
import java.util.HashMap;

// Pakassa kortin avain on sen nimi ja Integer on sen maara.
public class Deck {

    String name;
    private HashMap<Card, Integer> cards;

    public Deck(String name) {
        cards = new HashMap<Card, Integer>();
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void addCards(Card card, int amount) {
        if (amount > 0) {
            if (cards.containsKey(card)) {
                cards.replace(card, amount + cards.get(card));
            } else {
                cards.put(card, amount);
            }
        }
    }

    public int amountOfCard(Card card) {
        if (cards.containsKey(card)) {
            return cards.get(card);
        }
        return 0;
    }

    public void removeCardAmount(Card card, int toRemove) {
        if (toRemove >= 1) {
            if (cards.containsKey(card)) {
                int nykymaara = cards.get(card);
                if (toRemove >= nykymaara) {
                    cards.remove(card);
                } else {
                    cards.replace(card, nykymaara - toRemove);
                }
            }
        }
    }

    public void removeCardAll(Card card) {
        if (cards.containsKey(card)) {
            cards.remove(card);
        }
    }
    

    public void empty() {
        cards = new HashMap<Card, Integer>();

    }
}
