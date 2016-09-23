package uni.joel.deckard.ui;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        Login login = new Login();
        SwingUtilities.invokeLater(login);
    }
}
