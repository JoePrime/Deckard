
package uni.joel.deckard.player;

import java.util.HashMap;
import uni.joel.deckard.logic.Deck;

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
