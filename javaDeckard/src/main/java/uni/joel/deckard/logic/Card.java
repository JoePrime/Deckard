
package uni.joel.deckard.logic;

public class Card {

    String nimi;
    int mana;
    String kuvaus;
    
    public Card(String nimi, int mana, String kuvaus) {
        this.nimi = nimi;
        this.mana = mana;
        this.kuvaus = kuvaus;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }
    
}
