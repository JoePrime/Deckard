package uni.joel.deckard.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import uni.joel.deckard.logic.Battle;
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
    private Player player1;
    private Player player2;
    private Game game;
    private Battle battle;

    /**
     * Constructor for login. Creates a new JFrame to put the UI components in.
     * Gets a Game as a parameter to put the new Players in.
     *
     * @param game The game the login screen belongs to.
     */
    public Login(Game game) {
        frame = new JFrame();
        this.game = game;
    }

    @Override
    public void run() {
        frame = new JFrame("Login");
        frame.setPreferredSize(new Dimension(800, 100));
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
        container.setLayout(new GridLayout(1, 2));

        JPanel vasenPaneeli = new JPanel(new GridLayout(2, 2));
        JLabel text1 = new JLabel("Name for player 1:");
        text1.setHorizontalAlignment(SwingConstants.CENTER);
        vasenPaneeli.add(text1);
        JTextField usernameField1 = new JTextField();
        vasenPaneeli.add(usernameField1);
        JLabel text2 = new JLabel("Name for player 2:");
        text2.setHorizontalAlignment(SwingConstants.CENTER);
        vasenPaneeli.add(text2);
        JTextField usernameField2 = new JTextField();
        vasenPaneeli.add(usernameField2);

        container.add(vasenPaneeli);

        JButton submitButton = new JButton("Start the game!");
        LoginButtonListener loginListener = new LoginButtonListener(usernameField1, usernameField2);
        submitButton.addActionListener(loginListener);
        container.add(submitButton);
    }

    public class LoginButtonListener implements ActionListener {

        private JTextField nameField1;
        private JTextField nameField2;

        public LoginButtonListener(JTextField nameField1, JTextField nameField2) {
            this.nameField1 = nameField1;
            this.nameField2 = nameField2;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            player1 = new Player(nameField1.getText());
            player2 = new Player(nameField2.getText());
            System.out.println(player1);
            System.out.println(player2);
        }
    }

    public JFrame getFrame() {
        return frame;
    }
}
