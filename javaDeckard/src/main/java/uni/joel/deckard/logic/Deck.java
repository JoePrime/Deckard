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

    /**
     * Constructor for Deck.
     * @param name 
     */
    public Deck(String name) {
        cards = new HashMap<>();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Converts the HashMap containing the cards to an ArrayList, chooses a
     * random card from the ArrayList, and returns that card. ArrayList is used
     * for the easier random access.
     *
     * @return Returns the drawn card.
     */
    public Card newCard() {
        ArrayList<Card> cardsArray = convertToArray(cards);
        Random random = new Random();
        int cardIndex = random.nextInt(cardsArray.size());
        Card card = cardsArray.get(cardIndex);
        return card;
    }

    /**
     * Adds the given amount of the given card to the deck.
     *
     * @param card the card to be added
     * @param amount amount of the card to be added
     *
     * @see uni.joel.deckard.logic.Battle#useCard(uni.joel.deckard.logic.Player,
     * uni.joel.deckard.logic.cards.Card)
     */
    public void addCards(Card card, int amount) {
        if (amount > 0) {
            if (cards.containsKey(card)) {
                cards.replace(card, amount + cards.get(card));
            } else {
                cards.put(card, amount);
            }
        }
    }

    /**
     * Returns the amount of the given card in the deck.
     *
     * @param card The card of which amount was asked for.
     * @return The amount of the card.
     */
    public int amountOfCard(Card card) {
        if (cards.containsKey(card)) {
            return cards.get(card);
        }
        return 0;
    }

    /**
     * Removes the given amount of the specified card from the deck.
     *
     * @param card The card of which amount was asked for.
     * @param toRemove The amount to be removed.
     */
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

    /**
     * Removes all of the given card from the deck.
     *
     * @param card The card of which instances all should be removed.
     */
    public void removeCardAll(Card card) {
        if (cards.containsKey(card)) {
            cards.remove(card);
        }
    }

    /**
     * Empties the deck entirely.
     */
    public void empty() {
        cards = new HashMap<>();
    }

    /**
     * Checks if the deck is empty.
     *
     * @return True if the deck is empty, otherwise false.
     */
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    /**
     * Converts the HashMap the cards are stored in to an ArrayList for easier
     * random access.
     *
     * @param cardMap
     * @return
     */
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
