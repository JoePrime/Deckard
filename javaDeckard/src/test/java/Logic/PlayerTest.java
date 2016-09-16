
package Logic;

import Logic.Player;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PlayerTest {
    
    private Player pelaaja;
    
    @Before
    
    @Test
    public void pelaajanNimiLuodaanOikein() {
        Player matti = new Player("Matti");
        assertEquals("Matti", matti.getNimi());
    }
    
}
