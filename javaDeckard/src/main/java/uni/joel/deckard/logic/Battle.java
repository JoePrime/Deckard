package uni.joel.deckard.logic;

import java.util.Random;
import uni.joel.deckard.logic.cards.AttackCard;
import uni.joel.deckard.logic.cards.BypassAttackCard;
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
    int turn = 0;
    public Player startingPlayer;

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
        giveStartingDeck(p1);
        giveStartingDeck(p2);
        giveStartingHand(p1);
        giveStartingHand(p2);
        battleView.updateAll();
    }

    /**
     * Picks a random player out of the two to start.
     *
     * @return Returns the starting player
     */
    public Player drawStartingPlayer() {
        Random drawer = new Random();
//        int result = drawer.nextInt(2);       FIX THIS BACK
        int result = 0;
        if (result == 0) {
            startingPlayer = p1;
            return p1;
        } else {
            startingPlayer = p1;
            return p2;
        }
    }

    public void giveStartingDeck(Player player) {
        player.getDeck().addCards(new AttackCard(), 5);
        player.getDeck().addCards(new BypassAttackCard(), 5);
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

    public void endTurn() {
        if (turn % 2 == 0) {
            if (startingPlayer == p1) {
                battleView.hidePlayerCards(p1);
            } else {
                battleView.hidePlayerCards(p2);
            }
            p1.changeManaBy(p1.getManaRecovery());
            p2.changeManaBy(p2.getManaRecovery());
        } else if (startingPlayer == p1) {
            battleView.hidePlayerCards(p2);
        } else {
            battleView.hidePlayerCards(p1);
        }
        turn += 1;
        battleView.updateAll();
    }

    public int getTurn() {
        return turn;
    }

    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }
}
