package uni.joel.deckard.logic;

import uni.joel.deckard.ui.*;
import javax.swing.SwingUtilities;

/**
 * The game class. Contains the player(s).
 *
 * @author Joel
 */
public class Game {

    /**
     * Constructor for Game.
     */
    public Game() {

    }

    /**
     * Creates a new login window and invokes it.
     */
    public void startGame() {
        LoginView loginscreen = new LoginView(this);
        SwingUtilities.invokeLater(loginscreen);
    }

}
