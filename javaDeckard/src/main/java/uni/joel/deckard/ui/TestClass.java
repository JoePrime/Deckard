package uni.joel.deckard.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * A test class for testing stuff.
 *
 * @author Joel
 */
public class TestClass implements Runnable {

    private JFrame frame;

    /**
     * Constructor for TestClass.
     */
    public TestClass() {
    }

    @Override
    public void run() {
        frame = new JFrame("Headline");
        frame.setPreferredSize(new Dimension(200, 100));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
    }

    public JFrame getFrame() {
        return frame;
    }
}
