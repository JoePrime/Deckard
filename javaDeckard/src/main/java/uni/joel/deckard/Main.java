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
     *
     * @param args arguments
     */
    public static void main(String[] args) {

//        // DEMO/TEST CODE
//        Player p1 = new Player("Harri");
//        Player p2 = new Player("Ritva");
//        Battle battle = new Battle(p1, p2);
//        Card newCard = new AttackCard("Sword", 5, "Used to hit the opponent.");
//        p1.addToHand(newCard);
//        System.out.println("Ritva has " + p2.getHitpoints() + " hitpoints.");
//        p1.useCard(newCard);
//        System.out.println("Attack card used.");
//        System.out.println("Ritva has " + p2.getHitpoints() + " hitpoints.");
        
        Game game = new Game();
        game.newGameWindow();

    }
}
