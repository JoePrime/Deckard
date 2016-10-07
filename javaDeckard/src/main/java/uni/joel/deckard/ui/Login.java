package uni.joel.deckard.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
import uni.joel.deckard.logic.Game;
import uni.joel.deckard.logic.Player;

/**
 * This initializes, shows and takes care of the functionality of the GUI login
 * screen.
 *
 * @author Joel
 */
public class Login implements Runnable {

    private JFrame frame;
    private Player player;
    private Game game;

    /**
     * Constructor for login. Creates a new JFrame to put the UI components in.
     * Gets a Game as a parameter to put the new Players in.
     * @param game The game the login screen belongs to.
     */
    public Login(Game game) {
        frame = new JFrame();
        this.game = game;
    }

    @Override
    public void run() {
        frame = new JFrame("Login");
        frame.setPreferredSize(new Dimension(600, 80));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();

        frame.setVisible(true);
    }

    /**
     * Creates and positions the components in the login window.
     *
     * @param container
     */
    private void createComponents(Container container) {
        JLabel text = new JLabel("Give a username: ");
        container.add(text, BorderLayout.WEST);
        JTextField usernameField = new JTextField();
        container.add(usernameField);
        JButton submitButton = new JButton("Continue");
        LoginButtonListener loginListener = new LoginButtonListener(usernameField);
        submitButton.addActionListener(loginListener);
        container.add(submitButton, BorderLayout.EAST);
    }

    /**
     * A button listener that creates a new player with the name written into
     * NameField when the Login button is clicked.
     */
    public class LoginButtonListener implements ActionListener {

        private JTextField nameField;

        /**
         * Constructor for LoginButtonListener.
         * @param nameField The namefield containing the name for the new Player
         * the LoginButtonListener creates.
         */
        public LoginButtonListener(JTextField nameField) {
            this.nameField = nameField;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            player = new Player(nameField.getText());
            game.setPlayer1(player);
            System.out.println(player);
        }
    }

    public JFrame getFrame() {
        return frame;
    }
}
