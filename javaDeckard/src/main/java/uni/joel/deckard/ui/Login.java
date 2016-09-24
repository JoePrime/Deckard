package uni.joel.deckard.ui;

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
        frame.setPreferredSize(new Dimension(1000, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        luoKomponentit(frame.getContentPane());

        frame.pack();
        
        frame.setVisible(true);
        
    }
    
    private void luoKomponentit(Container container) {
        JLabel teksti = new JLabel("Kirjoita nimimerkki");
        container.add(teksti);
    }

    public JFrame getFrame() {
        return frame;
    }
}
