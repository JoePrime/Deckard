
package uni.joel.deckard.player;

import java.util.HashMap;
import uni.joel.deckard.logic.Deck;

public class Account {
    
    String nimi;
    HashMap<String, Deck> pakat;

    public Account(String nimi) {
        this.nimi = nimi;
        pakat = new HashMap();
    }
    
    // Muokkaa, entä jos on jo tuon niminen pakka?
    public void lisaaPakka(String nimi, Deck pakka) {
        pakat.put(nimi, pakka);
    }
    
}
