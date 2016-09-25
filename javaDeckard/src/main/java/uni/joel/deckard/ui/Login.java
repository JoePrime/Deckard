package uni.joel.deckard.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JLabel;

public class Login implements Runnable {

    private JFrame frame;

    public Login() {
        frame = new JFrame();
    }

    @Override
    public void run() {
        frame = new JFrame("Kirjautuminen");
        frame.setPreferredSize(new Dimension(1280, 720));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        luoKomponentit(frame.getContentPane());

        frame.pack();
        
        frame.setVisible(true);
        
    }
    
    private void luoKomponentit(Container container) {
        JLabel teksti = new JLabel("Anna nimimerkki");
        container.add(teksti, BorderLayout.CENTER);
    }

    public JFrame getFrame() {
        return frame;
    }
}
