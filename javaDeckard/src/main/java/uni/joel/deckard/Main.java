package uni.joel.deckard;

import uni.joel.deckard.logic.Player;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import uni.joel.deckard.logic.*;
import uni.joel.deckard.logic.cards.AttackCard;
import uni.joel.deckard.logic.cards.BypassAttackCard;
import uni.joel.deckard.logic.cards.Card;
import uni.joel.deckard.logic.cards.TestCard;
import uni.joel.deckard.ui.*;

/**
 * The main class where everything is started from.
 *
 * @author Joel
 */
public class Main {

    /**
     * The main method for Main.
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.startGame();

    }
}
