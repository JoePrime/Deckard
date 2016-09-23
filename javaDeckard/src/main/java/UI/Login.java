package UI;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Login implements Runnable {

    private JFrame frame;

    public Login() {

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
    }

    public JFrame getFrame() {
        return frame;
    }
}
