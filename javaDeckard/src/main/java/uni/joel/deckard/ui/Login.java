package uni.joel.deckard.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
     * @param game The game the login screen belongs to.
     */
    public Login(Game game) {
        frame = new JFrame();
        this.game = game;
    }

    @Override
    public void run() {
        frame = new JFrame("Login");
        frame.setPreferredSize(new Dimension(800, 500));
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
        container.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridheight = 2;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        JLabel text1 = new JLabel("Username for player 1: ");
        JLabel text2 = new JLabel("Username for player 2: ");
        container.add(text1, c);
        c.gridy = 1;
//        container.add(text2, c);
//        JTextField usernameField1 = new JTextField();
//        JTextField usernameField2 = new JTextField();
//        container.add(usernameField1);
//        container.add(usernameField2);
//        JButton submitButton = new JButton("Continue");
//        LoginButtonListener loginListener = new LoginButtonListener(usernameField1, usernameField2);
//        submitButton.addActionListener(loginListener);
//        container.add(submitButton, BorderLayout.EAST);
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
            System.out.println(player1);
        }
    }

    public JFrame getFrame() {
        return frame;
    }
}
