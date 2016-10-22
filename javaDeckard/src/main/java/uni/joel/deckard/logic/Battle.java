package uni.joel.deckard.logic;

import uni.joel.deckard.logic.cards.Card;
import uni.joel.deckard.ui.BattleView;

/**
 * The main part of the game is the battle screen and actions. Those are
 * controlled here.
 *
 * @author Joel
 */
public class Battle {

    // add turn counter!
    private Player p1, p2;
    BattleView battleView;

    /**
     * Creates a new Battle Object and sets given players p1 and p2 as opponents
     * to each other.
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

    /**
     * Starts the battle by creating a new BattleView runnable and running it.
     */
    public void StartBattle() {
        battleView = new BattleView(this);
        battleView.run();
        giveStartingHand(p1);
        giveStartingHand(p2);
        battleView.updateAll();
    }

    /**
     * Gives the first five cards to the appointed player's hand at the start of
     * the game.
     *
     * @param player The player the cards will be given to.
     */
    public void giveStartingHand(Player player) {
        if (!player.deck.isEmpty()) {
            for (int i = 0; i < 5; i++) {
                player.drawCard();
            }
        }
    }

    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }
}
