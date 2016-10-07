package uni.joel.deckard.logic;

import uni.joel.deckard.logic.cards.Card;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Deck-class with methods for modifying the cards it contains. In the cards
 * hashmap the name of the card is the key and its amount is the value.
 *
 * @author Joel
 */
public class Deck {

    private String name;
    private HashMap<Card, Integer> cards;

    public Deck(String name) {
        cards = new HashMap<>();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Adds the given amount of the given card to the deck.
     *
     * @param card Lisättävä kortti
     * @param amount Lisättävä määrä
     *
     * @see uni.joel.deckard.logic.Battle#useCard(uni.joel.deckard.logic.Player,
     * uni.joel.deckard.logic.cards.Card)
     */
    public Card newCard() {
        ArrayList<Card> cardsArray = convertToArray(cards);
        Random random = new Random();
        int cardIndex = random.nextInt(cardsArray.size());
        Card card = cardsArray.get(cardIndex);
        this.removeCardAmount(card, 1);
        return card;
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
        cards = new HashMap<>();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    private ArrayList<Card> convertToArray(HashMap<Card, Integer> cardMap) {
        ArrayList<Card> cardsArray = new ArrayList<>();
        for (Card card : cardMap.keySet()) {
            int amount = cardMap.get(card);
            for (int i = 0; i < amount; i++) {
                cardsArray.add(card);
            }
        }
        return cardsArray;
    }

    public HashMap<Card, Integer> getCards() {
        return cards;
    }
}
