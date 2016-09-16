
package Logic;

import java.util.HashMap;

public class Account {
    
    String nimi;
    HashMap<String, Deck> pakat;

    public Account(String nimi) {
        this.nimi = nimi;
        pakat = new HashMap<String, Deck>();
    }
    
    // Muokkaa, entä jos on jo tuon niminen pakka?
    public void lisaaPakka(String nimi, Deck pakka) {
        pakat.put(nimi, pakka);
    }
    
}
