
package uni.joel.deckard.logic;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BattleTest {
 
    private Battle testBattle;
    
    @Before
    public void createNewBattle() {
        Player p1 = new Player("p1");
        Player p2 = new Player("p2");
        testBattle = new Battle(p1, p2);
    }
    
    @Test
    public void newBattleCreatedCorrectly() {
        assertThat(testBattle.getP1().getOpponent(), is(testBattle.getP2()));
        assertThat(testBattle.getP2().getOpponent(), is(testBattle.getP1()));
    }
}
