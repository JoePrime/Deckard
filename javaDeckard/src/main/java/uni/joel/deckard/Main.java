package uni.joel.deckard;

import uni.joel.deckard.logic.Player;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import uni.joel.deckard.logic.*;
import uni.joel.deckard.ui.*;

/**
 * The main class where everything is started from.
 * 
 * @author Joel
 */
public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.newGame();
    }
}
