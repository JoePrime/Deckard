package uni.joel.deckard.logic;

import uni.joel.deckard.ui.*;
import javax.swing.SwingUtilities;
import uni.joel.deckard.player.Player;

public class Game {

    private Player player1;

    public void Game() {

    }

    public void uusi() {
        Login kirjautuminen = new Login(this);
        SwingUtilities.invokeLater(kirjautuminen);
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }
    
        public Player getPlayer1() {
        return player1;
    }
}
