package Logic;

import java.util.ArrayList;
import java.util.HashMap;

// Pakassa kortin avain on sen nimi ja Integer on sen maara.
public class Deck {

    String nimi;
    private HashMap<Card, Integer> kortit;

    public Deck(String nimi) {
        kortit = new HashMap<Card, Integer>();
        this.nimi = nimi;
    }
    
    public String getNimi() {
        return this.nimi;
    }

    public void lisaaKortteja(Card kortti, int maara) {
        if (maara > 0) {
            if (kortit.containsKey(kortti)) {
                kortit.replace(kortti, maara + kortit.get(kortti));
            } else {
                kortit.put(kortti, maara);
            }
        }
    }

    public int kortinMaara(Card kortti) {
        if (kortit.containsKey(kortti)) {
            return kortit.get(kortti);
        }
        return 0;
    }

    public void poistaKorttia(Card kortti, int poisMaara) {
        if (poisMaara >= 1) {
            if (kortit.containsKey(kortti)) {
                int nykymaara = kortit.get(kortti);
                if (poisMaara >= nykymaara) {
                    kortit.remove(kortti);
                } else {
                    kortit.replace(kortti, nykymaara - poisMaara);
                }
            }
        }
    }

    public void poistaKorttiaKaikki(Card kortti) {
        if (kortit.containsKey(kortti)) {
            kortit.remove(kortti);
        }
    }
    

    public void tyhjenna() {
        kortit = new HashMap<Card, Integer>();

    }
}
