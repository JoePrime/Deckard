package uni.joel.deckard.logic;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import uni.joel.deckard.logic.cards.AttackCard;
import uni.joel.deckard.logic.cards.BypassAttackCard;

public class BattleTest {

    private Battle testBattle;
    private Player p1;
    private Player p2;

    @Before
    public void createNewBattle() {
        p1 = new Player("p1");
        p2 = new Player("p2");
        testBattle = new Battle(p1, p2);
        testBattle.StartBattle();
    }

    @Test
    public void newBattleCreatedCorrectly() {
        assertThat(testBattle.getP1().getOpponent(), is(testBattle.getP2()));
        assertThat(testBattle.getP2().getOpponent(), is(testBattle.getP1()));
    }

    @Test
    public void startingDecksAreGivenCorrectly() {
        // Can not ask Deck whether it contains a card or not because Hashmap
        // does not compare keys using equals method???
        // FIND OUT
    }
    
    @Test
    public void startingHandsAreGivenCorrectly() {
        assertThat(p1.getHand().size(), is(Hand.DEFAULTSIZE));
        assertThat(p2.getHand().size(), is(Hand.DEFAULTSIZE));
        if (!p1.getHand().containsCard(new AttackCard())) {
            assertTrue(p1.getHand().containsCard(new BypassAttackCard()));
        } else if (!p1.getHand().containsCard(new BypassAttackCard())) {
            assertTrue(p1.getHand().containsCard(new AttackCard()));
        }
    }
    
    @Test
    public void startingPlayerIsDrawnCorrectly() {
        assertTrue(testBattle.startingPlayer == p1 || testBattle.startingPlayer == p2);
        if (testBattle.startingPlayer == p1) {
            assertFalse(testBattle.startingPlayer == p2);
        }
        if (testBattle.startingPlayer == p2) {
            assertFalse(testBattle.startingPlayer == p1);
        }
    }
    
}
