package uni.joel.deckard.logic;

import uni.joel.deckard.ui.*;
import javax.swing.SwingUtilities;

public class Game {

    public void Game() {
        
    }
    
    public void uusi() {
        Login kirjautuminen = new Login();
        SwingUtilities.invokeLater(kirjautuminen);
    }
}
