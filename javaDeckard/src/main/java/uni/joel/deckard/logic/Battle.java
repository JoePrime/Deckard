package uni.joel.deckard.logic;
import uni.joel.deckard.logic.cards.Card;

/**
 * The main part of the game is the battle screen and actions. Those are
 * controlled here.
 * 
 * @author Joel
 */
public class Battle {
    
    // add turn counter!
    private Player p1, p2;
    
    public Battle(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        p1.setOpponent(p2);
        p2.setOpponent(p1);
    }
    
    // UNNECESSARY??
    public Player getOpponent(Player player) {
        if (player == p1) {
            return p2;
        } else {
            return p1;
        }
    }
    // UNNECESSARY??
    public void useCard(Player user, Card card) {
        
    }

    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }
}
