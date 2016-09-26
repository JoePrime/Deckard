package uni.joel.deckard.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
import uni.joel.deckard.logic.Game;
import uni.joel.deckard.player.Player;

public class Login implements Runnable {

    private JFrame frame;
    private Player player;
    private Game game;

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

    public class LoginButtonListener implements ActionListener {
        
        private JTextField NameField;
        
        public LoginButtonListener(JTextField nameField) {
            this.NameField = nameField;
        }
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            player = new Player(NameField.getText());
            game.setPlayer1(player);
            System.out.println(player);
        }
    }
    
    public JFrame getFrame() {
        return frame;
    }
}
