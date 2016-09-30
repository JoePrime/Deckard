
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

    public Account(String name) {
        this.name = name;
        decks = new HashMap();
    }
    
    // Muokkaa, entä jos on jo tuon niminen pakka?
    public void addDeck(String name, Deck deck) {
        decks.put(name, deck);
    }
    
}
