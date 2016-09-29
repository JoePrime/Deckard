
package uni.joel.deckard.player;

import uni.joel.deckard.player.Player;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PlayerTest {
    
    private Player player;
    
    
    @Before
    
    @Test
    public void playerCreatedCorrectly() {
        Player matti = new Player("Matti");
        assertEquals("Matti", matti.getName());
        assertEquals("game deck", matti.getDeck().getName());
    }
    
    
    
}
