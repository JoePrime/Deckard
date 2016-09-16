
package Logic;

public class Player {
    
    String nimi = "";
    Deck pakka;
    
    public Player(String nimi) {
        this.nimi = nimi;
        pakka = new Deck("pelipakka");
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public Deck getPakka() {
        return this.pakka;
    }
}
