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

    /**
     * Creates a new Battle Object and sets given players p1 and p2 as opponents
     * to each others.
     *
     * @param p1 first player
     * @param p2 second player
     */
    public Battle(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        p1.setOpponent(p2);
        p2.setOpponent(p1);
    }

    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }
}
