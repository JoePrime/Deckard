package uni.joel.deckard;

import uni.joel.deckard.logic.Player;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import uni.joel.deckard.logic.*;
import uni.joel.deckard.logic.cards.AttackCard;
import uni.joel.deckard.logic.cards.Card;
import uni.joel.deckard.ui.*;

/**
 * The main class where everything is started from.
 *
 * @author Joel
 */
public class Main {

    public static void main(String[] args) {
        //        // Testing that AttackCard works
        //        Card card = new AttackCard("Warrior", 5, "Strikes the enemy.");
        //        Player player1 = new Player("player1");
        //        Player player2 = new Player("player2");
        //        Battle battle = new Battle(player1, player2);
        //        player1.addToHand(card);
        //        player1.useCard(card);
        //        System.out.println(player2.getHitpoints());
        
        
//    Battle testBattle;
//
//        Player p1 = new Player("Anni");
//        Player p2 = new Player("Pekka");
//        testBattle = new Battle(p1, p2);
//
//        System.out.println("Expected: " + testBattle.getP1().getOpponent().toString());
//        System.out.println("Got: " + p2.toString());
//        System.out.println(testBattle.getP1().getOpponent().equals(testBattle.getP2()));
        
        Card card1 = new AttackCard("Card", 5, "testcard");
        Card card2 = new AttackCard("Card", 5, "testcard");
        System.out.println(card1.equals(card2));
        
        
//        Game game = new Game();
//        game.newGame();
}
}
