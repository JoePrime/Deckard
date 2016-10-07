package uni.joel.deckard;

import uni.joel.deckard.logic.Player;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import uni.joel.deckard.logic.*;
import uni.joel.deckard.logic.cards.AttackCard;
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
     * @param args 
     */
    public static void main(String[] args) {

        Hand hand = new Hand();
        TestCard card1 = new TestCard("A test card", 5, "For testing purposes.");
        TestCard card2 = new TestCard("Another test card", 5, "Also for testing purposes.");

        hand.addCard(card1);
        hand.addCard(card2);
        hand.addCard(card2);

        System.out.println(hand.amountOfCard(card1));
        System.out.println(hand.amountOfCard(card2));
    }

//      
//        Game game = new Game();
//        game.newGame();
}
