
package uni.joel.deckard.ui;

import javax.swing.JFrame;
import uni.joel.deckard.logic.Battle;

public class BattleView implements Runnable {
    
    private JFrame frame;
    private Battle battle;
    
    /**
     * Creates a new Battle window for the given Battle.
     * @param battle The battle the window is created for.
     */
    public BattleView(Battle battle) {
        this.battle = battle;
    }
    
    @Override
    public void run() {
        
    }
}
