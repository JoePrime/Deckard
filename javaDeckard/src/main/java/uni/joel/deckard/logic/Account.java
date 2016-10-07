package uni.joel.deckard.logic;

import java.util.HashMap;
import uni.joel.deckard.logic.Deck;

/**
 * Creating an account makes it possible to save decks. It is also possible to
 * play without an account.
 *
 * @author Joel
 */
public class Account {

    String name;
    HashMap<String, Deck> decks;

    /**
     * Constructor method for Account.
     * @param name 
     */
    public Account(String name) {
        this.name = name;
        decks = new HashMap();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Adds the given deck to the account. Currently everyone has one default
     * deck and this is not used.
     *
     * @param name name of the deck
     * @param deck HashMap, key = name, value = deck
     */
    // Modify, what if such a deck already exists?
    public void addDeck(String name, Deck deck) {
        decks.put(name, deck);
    }

    public HashMap<String, Deck> getDecks() {
        return decks;
    }

    public void setDecks(HashMap<String, Deck> decks) {
        this.decks = decks;
    }

}
