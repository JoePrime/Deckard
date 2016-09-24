package uni.joel.deckard.logic;

import uni.joel.deckard.ui.*;
import javax.swing.SwingUtilities;

public class Game {

    public static void main(String[] args) {
        Login syotaNimet = new Login();

        SwingUtilities.invokeLater(syotaNimet);
    }
}
