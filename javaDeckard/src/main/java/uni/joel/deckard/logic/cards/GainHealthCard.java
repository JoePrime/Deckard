
package uni.joel.deckard.logic.cards;

public class GainHealthCard extends Card {
    
    String name = "Health Potion";
    int mana = 5;
    String desc = "Restores 8 health";
            
    public GainHealthCard(String name, int mana, String desc) {
        super(name, mana, desc);
    }
    
    
}
